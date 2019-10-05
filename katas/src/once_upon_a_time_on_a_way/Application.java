package once_upon_a_time_on_a_way;

import java.util.ArrayList;
import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		System.out.println(dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
		// "WEST"
	}

	public static String[] dirReduc(String[] arr) {
		if(arr.length == 0) {
			return new String[] {};
		} else if (arr.length == 1) {
			return arr;
		} else {		
			ArrayList<String> result = new ArrayList<>();
			result.add(arr[0]);
			
			for(int i = 1; i < arr.length; i++) {
				if (result.isEmpty()) {
					result.add(arr[i]);
				} else {
					switch(result.get(result.size()-1)) {
					case "NORTH":
						if(!arr[i].contains("SOUTH")) result.add(arr[i]);
						else result.remove(result.size()-1);
						break;
					case "SOUTH":
						if(!arr[i].contains("NORTH")) result.add(arr[i]);
						else result.remove(result.size()-1);
						break;
					case "EAST":
						if(!arr[i].contains("WEST")) result.add(arr[i]);
						else result.remove(result.size()-1);
						break;
					case "WEST":
						if(!arr[i].contains("EAST")) result.add(arr[i]);
						else result.remove(result.size()-1);
						break;
					default: return new String[] {};
					}
				}				
			}
			String [] strResult = result.toArray(new String[0]);
			return strResult;
		}
	}
	
	
	public static String[] topDirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
		
	}	
}
