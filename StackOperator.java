package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.Stack;

public class StackOperator
{
	public static void main(String[] args)
	{
		String data = "1 2 3 *";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		Stack<Object> stack = new Stack<Object>();

		while (sc.hasNext())
		{
			String input = sc.next();
			if (isInteger(input) || isBoolean(input)) stack.push(input);
			else
			{
				if (stack.size() < 2)
				{
					System.out.print("SYNTAX ERROR");
					System.exit(0);
				}
				String value1 = String.valueOf(stack.pop());
				String value2 = String.valueOf(stack.pop());

				if (isInteger(value1) && isInteger(value2))
				{
					if (!isOperandNumeric(input))
					{
						System.out.print("TYPE ERROR");
						System.exit(0);
					}
					else
					{
						if (input.equals("+")) stack.push(Integer.valueOf(value1) + Integer.valueOf(value2));
						else if (input.equals("==")) stack.push(Integer.valueOf(value1) == Integer.valueOf(value2));
						else stack.push(Integer.valueOf(value1) * Integer.valueOf(value2));
					}
				}
				else if (isBoolean(value1) && isBoolean(value2))
				{
					if (isOperandNumeric(input))
					{
						System.out.print("TYPE ERROR");
						System.exit(0);
					}
					if (input.equals("and")) stack.push(Boolean.valueOf(value1) && Boolean.valueOf(value2));
					else stack.push(Boolean.valueOf(value1) || Boolean.valueOf(value2));
				}
				else
				{
					System.out.println("TYPE ERROR");
					System.exit(0);
				}

			}
		}
		if (stack.size() == 1)
		{
			System.out.print(stack.pop());
		}
		else System.out.println("SYNTAX ERROR");

	}

	public static Boolean isInteger(String s)
	{
		try
		{
			Integer.parseInt(s);
			return true;
		} catch (Exception e)
		{
			return false;
		}
	}

	public static Boolean isBoolean(String s)
	{
		if ("true".equals(s) || "false".equals(s)) return true;
		return false;
	}

	public static Boolean isOperandNumeric(String s)
	{
		if (s.equals("+") || s.equals("*") || s.equals("==")) return true;
		return false;
	}
}
