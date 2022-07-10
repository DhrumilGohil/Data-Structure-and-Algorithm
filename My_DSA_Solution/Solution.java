package Practice;

import java.awt.PrintGraphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

//class Solution {
//    public static String reverseWords(String s) {
//         String strArray[] = s.split(" ");
//        StringBuilder result =  new StringBuilder();
//        StringBuilder stringBuilder =  new StringBuilder();
//        stringBuilder.insert(0, "Hello");
//        stringBuilder.insert(0, "World");
//        
//        System.out.println(stringBuilder.toString());
//        for(int i = 0; i < strArray.length; i++)
//        {
//        	stringBuilder = new StringBuilder(strArray[i]);
//        	result.append(stringBuilder.reverse() + " ");
//        }     
//        return result.substring(0, result.length() - 1).toString();
//        
//optimize
//        public String reverseWords(String s) {
//        	char [] strArray=s.toCharArray();
//		int l=0,r=0;
//		int len=strArray.length;
//		for(int p=0;p<len;p++) {
//			while(r<len && strArray[r]!=' ') {
//				r++;
//			}
//			swap(strArray,l,r-1);
//			l=r+1;
//			r=l;
//		}
//		return new String(strArray);
//    }
//    
//   private  void swap(char[] strArray, int l, int i) {
//		while(l<i) {
//			char temp=strArray[l];
//			strArray[l]=strArray[i];
//			strArray[i]=temp;
//			l++;
//			i--;
//		}
//   }
//    }

//    public static void main(String[] args)
//    {
//    	reverseWords("Let's take LeetCode contest");
//    }
//}

//    class Solution {
//        public String convertToTitle(int columnNumber) {
//            StringBuilder result = new StringBuilder();
//
//            while(columnNumber>0){
//                columnNumber--;
//                result.insert(0, (char)('A' +columnNumber % 26));
//                columnNumber /= 26;
//            }
//
//            return result.toString();
//        }
//    }

//
//class Solution {
//	   public static String sortSentence(String s) 
//	    {
//	        String[] splitString = s.split(" ");
//	        String result[] = new String[splitString.length];
//	        StringBuilder temp = new StringBuilder();
//	        for(int i = 0 ; i < splitString.length; i++)
//	        {
//	            int index = (splitString[i].charAt(splitString[i].length() - 1) - '0'); 
//	            temp.insert(index - 1, splitString[i].substring(0,splitString[i].length() -1) + " ");	           
//	        }
//	        // for(int i = 0 ; i < result.length; i++)
//	        // {
//	        // 	temp.append(result[i] + " ");
//	        // }
//	       
//	        return temp.substring(0,temp.length() - 1);
//	    }
//	   
//	   public static void main(String[] args)
//	   {
//		   sortSentence("is2 sentence4 This1 a3");
//	   }
//	}
//class Solution {
//    public static boolean isLongPressedName(String name, String typed) {
//    	int typeLength = typed.length();
//        int nameLength = name.length();
//        
//        char nameArray[] = name.toCharArray();
//        char typedArray[] = typed.toCharArray();
//        
//        if(nameArray[0] != typedArray[0] || 
//        		nameArray[nameLength - 1] != typedArray[typeLength - 1])
//            return false;
//        int j = 0;
//        for(int i = 0; i < typeLength; i++)
//        {
//        	j += (typed.charAt(i) == name.charAt(j))? 1 : 0; 
//        	
//        	if(j == name.length())
//        	{
//        		while(i < typeLength)
//        		{
//        			if(typedArray[i] != nameArray[j - 1])
//        				return false;
//        			i++;
//        		}
//        		return true;
//        	}
//        }
//        
//        return false;
//    }
//    public static void main(String[] args)
//    {
//    	System.out.println(isLongPressedName(
//    			"vtkgn","vttkgnxn"));
//    }
//}
//class Solution {
//    public static boolean isPalindrome(String s) {
//    	int start = 0;
//        int end = s.length() - 1;
//         s = s.toLowerCase();
//       while(start < end)
//       {
//        	while(start <= end && !Character.isLetterOrDigit(arraystart)))
//        		start++;
//          
//        	while(end > -1 && !Character.isLetterOrDigit(arrayend)))
//        		end--;
//        	
//            if(start == s.length() && end == -1)
//               return true;
//            
//        	char ch1 = arraystart);
//        	char ch2 = arrayend); 
//        	
//	        if(ch1 != ch2)
//	        	return false;	
//	        start++;
//	        end--;
//       }
//        return true;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(isPalindrome(".,"));
//    }
//}

//class Solution {
//	
//	public static boolean subValidPalindrome(String s, int start,int end)
//	{
//		if(start > end)
//			return true;
//		
//		while(start < end)
//        {
//            if(arraystart) != arrayend))
//                return false;
//            start++;
//            end--;
//        }
//	}
//	
//    public static boolean validPalindrome(String s) {
//        int start = 0; 
//        int end = s.length() - 1;
//        
//        while(start < end)
//        {
//            if(arraystart) != arrayend))
//            {          
//                if(arraystart) == array--end))
//                {                	 
//                    while(start < end)
//                    {
//                        if(arraystart) != arrayend))
//                            return false;
//                        start++;
//                        end--;
//                    }
//                    return true;
//                }
//                else
//                {
//                	start++;
//                    end++;
//                    while(start < end)
//                    {
//                        if(arraystart) != arrayend))
//                            return false;
//                        start++;
//                        end--;
//                    }
//                    return true;
//                }
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
//    }
//}

//class Solution {
//	public static int findMinLength(String s[])
//	{
//	        int minLength = Integer.MAX_VALUE;
//	        for ( int i=0; i<s.length; i++){
//	        	int length = s[i].length();
//	            if(length <= minLength){
//	                minLength = length;
//	            }
//	        }
//	        return minLength;
//	}
//    public static  String longestCommonPrefix(String[] strs) {
//        int minLength = findMinLength(strs);
//        int length = strs.length;
//        String preFix = ""; 
//        for(int i = 0 ; i < minLength; i++)
//        {
//        	int j = 0;
//        	char ch = strs[j].charAt(i);
//        	j++;
//        	while(j < length && strs[j].charAt(i) == ch)
//        	{
//        		j++;
//        	}
//        	
//        	if(j == strs.length)
//        		preFix += ch;
//        }
//        	
//        return preFix;
//    }

//
//class Solution {
//    public static int romanToInt(String s) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        hashMap.put('I', 1);
//        hashMap.put('V', 5);
//        hashMap.put('X', 10);
//        hashMap.put('L', 50);
//        hashMap.put('C', 100);
//        hashMap.put('D', 500);
//        hashMap.put('M', 1000);
//        int value = 0;
//        int length =  s.length();
//        for(int i = 0; i < length; i++)
//        {
//            char ch = arrayi);
//            if(i + 1 < length && ch == 'I' && (arrayi + 1) == 'V' || arrayi + 1) == 'X' ))
//            {
//                value += hashMap.get(arrayi + 1)) - 1;
//                i++;
//            }
//            else   if(i + 1 < length &&ch == 'X' && (arrayi + 1) == 'L' || arrayi + 1) == 'C' ))
//            {
//                value += hashMap.get(arrayi + 1)) - 1;
//                i++;
//            }
//            else   if(i + 1 < length && ch == 'C' && (arrayi + 1) == 'D' || arrayi + 1) == 'M' ))
//            {
//                value += hashMap.get(arrayi + 1)) - 1;
//                i++;
//            }
//            else
//                value += hashMap.get(ch);
//        }
//        
//        return value;
//    }
//    
//    public static void main(String[] args)
//    {
//    	romanToInt("MCMXCIV");
//    }
//}
//class Solution {
//    public static boolean isValid(String s) {
//        int length = s.length();
//        String order ="";
//        int orderIndex = 0;
//        
//        for(int i = 0 ; i < length; i++)
//        {
//            char ch = arrayi);
//            
//            if(ch == '(') 
//            {order+=')';orderIndex++;}
//            else if(ch == '{') 
//            {order+='}';orderIndex++;}
//            else if(ch == '[') 
//            {order+=']';orderIndex++;}
//            else if(order.charAt(orderIndex - 1) == ch) orderIndex--;
//            else return false;   
//        }
//        
//        return true;
//    }
//    
//    public static void main(String[] args)
//    {
//    	isValid("()[]{}");
//    }
//}
//class Solution {
//	static int gcd(int a, int b)
//    {
//      if (b == 0)
//        return a;
//      return gcd(b, a % b);
//    }
//	
//	static int findGCD(String a2Array[])
//	{
//		int result = Integer.parseInt(a2Array[0]);
//		
//		for(int i = 1; i < a2Array.length; i++)
//			result = gcd(Integer.parseInt(a2Array[i]), result);
//		return result;
//	}
//     
//    // Driver method
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        
//        int a1 = scanner.nextInt();
//        
//        int a2 = scanner.nextInt();
//        
//        String a1Elements = scanner.nextLine();
//        
//        String a2Elements = scanner.nextLine();
//        
//        System.out.println(findGCD(a2Elements.split(" ")));
//    }
//}

//class Solution {
//    public static int subarraySum(int[] nums, int k) {
//    	int count = 0, sum = 0;
//        HashMap< Integer, Integer > map = new HashMap < > ();
//        map.put(0, 1);
//      
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (map.containsKey(sum - k))
//                count += map.get(sum - k);
//            map.put(sum, map.getOrDefault(sum, 0) + 1);
//        }
//        return count;
//    }
//    
//    public static void main(String[] args)
//    {
//    	subarraySum(new int[] {4,-1,7},3);
//    }
//}

//class A
//{
//	int number = 10;
//	public A() {
//		System.out.println("Hello Child!");
//	}
//	
//	void run()
//	{
//		System.out.println("Helloooooo");
//	}
//}
//
//class B extends A
//{
//	int number = 11;
//	@Override
//	void run()
//	{
//		System.out.println("Hii");
//	}
//}
//
//class C extends B{}
//class Solution {
//    public static int subarraySum(int[] nums, int k) {
//    	int count = 0, sum = 0;
//    	
//        HashMap< Integer, Integer > map = new HashMap < > ();
//        map.put(0, 1);
//        int max = Integer.MIN_VALUE;
//        System.out.println(~(43));
//      
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (map.containsKey(sum - k))
//                max = Math.max(max,i - map.get(sum - k));
//            map.put(sum, i);
//        }
//        
//        System.out.println(max);
//        return count;
//    }
//    
//    public static void main(String[] args)
//    {
//    	B b1 = new B();
//    	b1.run();
//    	System.out.println(b1.number);
//    	
//    	A a1 = new A();
//    	System.out.println(a1.getClass());
//    	a1.run();
//    	System.out.println("Hello".equals("Hello"));
//    	boolean b = b1 instanceof A;
//    	A c1 = new C();
//    	c1.run();
//    	System.out.println(c1.number);
//    	subarraySum(new int[] {10, 5, 2, 7, 1, 9},15);
//    }
//}

//Maximum subarray sum equals to k
//public class Solution
//{
//	static int maxSubArraySum(int arr[], int k)
//	{
//		int max = Integer.MIN_VALUE;
//		int sum = 0;
//		for(int i = 0; i < k; i++)
//			sum += arr[i];
//		
//		
//		max = sum;
//		
//		int length = arr.length;
//		for(int i = k; i < length; i++)
//		{
//			sum = sum - arr[i - k] + arr[i];
//			max = Math.max(sum, max);			
//		}
//		return max;
//	}
//	
//	static int minSubArraySum(int arr[], int k)
//	{
//		int min = 0;
//		int sum = 0;
//		for(int i = 0; i < k; i++)
//			sum += arr[i];
//		
//		
//		min = sum;
//		
//		int length = arr.length;
//		for(int i = k; i < length; i++)
//		{
//			sum = sum - arr[i - k] + arr[i];
//			min = Math.min(sum, min);			
//		}
//		return min;
//	}
//	
//	static void firstnegative(int arr[], int k)
//	{
//		int length = arr.length;		
//		List<Integer> list = new ArrayList<>();
//			
//		for(int i = 0, j = 0; j < length; j++)
//		{
//			// add negative number to list
//			if(arr[j] < 0)
//				list.add(arr[j]);
//			
//			// check for hit window
//			if((j - i + 1) == k)
//			{
//				// check is there are elements in list is empty 
//				// means no negative in window
//				if(list.isEmpty())
//					System.out.print(0 +" ");
//				// else means negative element exist in window
//				else 
//				{
//					System.out.println(list.get(0));			
//					// check if we pass from the window the added negative number of list
//					// then remove 
//					if(arr[i] == list.get(0))
//						list.remove(0);
//				}
//				i++;
//			}
//		}
//	}
//	
//	public static void main(String[] args)
//	{
//		double d = 0.0d;
//		System.out.println((double)12/5);
//		// System.out.println(maxSubArraySum(new int[] { 1, 4, 2, 10, 2, 3, 1, 0, 20}, 4));
//	//	 System.out.println(minSubArraySum(new int[] { 1, 4, 2, 10, 23, 3, 1, 0, 20}, 4));
//		 firstnegative(new int[] {12, -1, -7, 8, -15, 30, 16, 28}, 3);
//	}
//}

//class Solution {
//	static boolean isRepeat(String s)
//	{
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for(int i = 0 ; i < 3; i++)
//		{
////			if(map.containsKey(arrayi)))
////				return false;
////			map.put(arrayi), i);
//			
//		}
//		return true;
//	}
//	
//    public static int countGoodSubstrings(String s) {
//        int length = s.length();    
//        int count = 0;
//        StringBuilder str = new StringBuilder();
//        for(int i = 0,j=0; i < length; i++)
//        { 
//            str.append(arrayi));
//            if(i - j + 1 == 3)
//            {
//                if(isRepeat(str.toString()))
//                    count++;
//                str.deleteCharAt(0);           
//                j++;
//            }        
//        }
//        
//        return count;
//    }
//    
//    public static void main(String[] args)
//    {
//    	countGoodSubstrings("xyzzaz");
//    }
//}

//class Solution {
//
//	
//    public static int countGoodSubstrings(String s) {
//        int length = s.length();    
//        int count = 0;
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        for(int i = 0,j=0; i < length; i++)
//        { 
//        	 char ch = arrayj);
//        	 char sch = arrayi);
//            map.put(sch, map.getOrDefault(arrayi),0) + 1);
//            if(i - j + 1 == 3)
//            {
//                if(map.size() == 3)
//                    count++;
//                               
//                int val = map.get(ch);
//                
//                if((val - 1) == 0)
//                    map.rem 
//                	map.put(ch, (val - 1));
//                j++;
//                
//            }        
//        }
//        
//        return count;
//    }
//    
//  public static void main(String[] args)
//  {
//  	countGoodSubstrings("wbwqjjyqrcbmfzvqjmlg");
//  }
//}

//class Solution
//{
//	 public static int minimumDifference(int[] nums, int k) 
//	 {
//		 Arrays.sort(nums);
//		  int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//		  int length = nums.length;
//		  int diff = 0;
//	      for(int i = 0; i  < k; i++)
//	      {
//	    	  min = Math.min(min, nums[i]);
//	    	  max = Math.max(max, nums[i]);
//	      }
//	      
//	      diff = max - min;
//	      for(int i = k, j = 1; i < length; i++,j++)
//	    	  diff = Math.min(diff, nums[i] - nums[j]);
//	    	  
//	     return diff;
//	 }
//	public static void main(String[] args)
//	{
//		minimumDifference(new int[] {9,4,1,7},2);
//	}
//}

//class Solution {
//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        int length = nums.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        
//        
//        map.put(nums[0], 0);
//        for(int i = 1,j = 0; i < length; i++)
//        {
//        	if(map.containsKey(nums[i]) && Math.abs(i - j) <=k)
//        			return true;
//        	else 
//        		map.put(nums[i], i);
//        }
//        return false;
//    }
//    
//    public static void main(String[] args)
//    {
//    	containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2);
//    }
//}

//class Result {
//    
//    public static int sockMerchant(int n, List<Integer> ar) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        for(int item: ar)
//            map.put(item, map.getOrDefault(item, 0) + 1);
//        
//        for(Map.Entry<Integer, Integer> mapValue: map.entrySet())
//            if(mapValue.getValue() >= 2)
//                count++;
//        
//        return count;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] inputArray = input.split(" ");
//        int budget = Integer.valueOf(inputArray[0]);
//        int keyBoardSize = Integer.valueOf(inputArray[1]);
//        int usbSize = Integer.valueOf(inputArray[2]);
//        int keyboard[] = new int[keyBoardSize];
//        int usb[] = new int[usbSize];
//        
//        for(int i = 0; i < keyBoardSize; i++)
//            keyboard[i] = sc.nextInt();
//         for(int i = 0; i < usbSize; i++)
//            usb[i] = sc.nextInt();
//        
//        int amount = -1;
//        for(int i = 0; i < keyBoardSize; i++)
//        {
//            for(int j = 0; j < usbSize; j++)
//            {
//                if(keyboard[i] + usb[j] < budget)
//                    amount = Math.max(amount, keyboard[i] + usb[j]);
//            }
//        }
//        String string = "Dhrumil";
//        Arrays.sort(string.toCharArray());
//        
//        
//        
//        System.out.println(amount);
//    }
//}
//

//Count Occurrences of Anagrams
//public class Solution {
//	public static int findAnagram(String str, String text)
//	{
////		int count = 0;
////		int strLength = str.length();
////		int textLength = text.length();
////		HashMap<Character, Integer> textMap = new HashMap<>();
////		
////		for(int i = 0 ;i < textLength; i++)
////			textMap.put(text.charAt(i), textMap.getOrDefault(text.charAt(i), 0) + 1);
////		
////		
////		HashMap<Character, Integer> strmap = new HashMap<>();
////		for(int i = 0, j = 0; i < strLength; i++)
////		{
////			strmap.put(str.charAt(i), strmap.getOrDefault(str.charAt(i), 0) + 1);
////			
////			if(i - j + 1 == textLength)
////			{
////				if(textMap.equals(strmap))
////					count++;
////				
////				int val = strmap.get(str.charAt(j));
////				if(val - 1 == 0)
////					strmap.remove(str.charAt(j));
////				else 
////					strmap.put(str.charAt(j), val - 1);
////				
////				j++;
////			}
////			
////		}
////		return count;
//		int count = 0;
//		int strLength = str.length();
//		int textLength = text.length();
//		HashMap<Character, Integer> textMap = new HashMap<>();
//		
//		for(int i = 0 ;i < textLength; i++)
//			textMap.put(text.charAt(i), textMap.getOrDefault(text.charAt(i), 0) + 1);
//		
//		
//		HashMap<Character, Integer> strmap = new HashMap<>();
//		for(int i = 0, j = 0; i < strLength; i++)
//		{
//			strmap.put(str.charAt(i), strmap.getOrDefault(str.charAt(i), 0) + 1);
//			
//			if(i - j + 1 == textLength)
//			{
//				if(textMap.equals(strmap))
//					count++;
//				
//				int val = strmap.get(str.charAt(j));
//				char c = str.charAt(j);
//				if(val - 1 == 0)
//					strmap.remove(c);
//				else 
//					strmap.put(c, val - 1);
//				
//				j++;
//			}
//			
//		}
//		return count;
//	}
//    public static void main(String[] args) {
//    	findAnagram("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk", "kkkkk");
//    }
//}
//

//maximum of Subarray of size k
//public class Solution {
//	public static int maxiMumofSubArray(int[] array, int window)
//	{
//		int max = Integer.MIN_VALUE;
//		int length = array.length;
//		int sum = 0;
//		for(int i = 0, j = 0; i < length; i++)
//		{
//			sum += array[i];
//			
//			if(i - j + 1 == window)
//			{
//				max = Math.max(max, sum);
//				
//				sum -= array[j];
//				j++;
//			}
//		}
//		return max;
//	}
//    public static void main(String[] args) {
//    	maxiMumofSubArray(new int[] {1,2,3,4,5},2);
//    }
//}
//

//maximum of each Subarray of size k
//public class Solution {
//	public static List<Integer> maxiMumofSubArray(int[] array, int window)
//	{
//		List<Integer> list = new ArrayList<>();
//		List<Integer> result = new ArrayList<>();
//		int length = array.length;
//		int listSize;
//		for(int i = 0, j = 0; i < length; i++)
//		{
//			listSize = list.size() - 1;
//			while(list.size() > 0 && list.get(listSize) < array[i])
//			{
//				list.remove(listSize);
//				listSize--;
//			}
//			list.add(array[i]);
//			
//			if(i - j + 1 == window)
//			{
//				result.add(list.get(0));
//				
//				if(list.get(0) == array[j])
//					list.remove(0);
//				j++;
//			}
//				
//		}
//		return result;
//	}
//  public static void main(String[] args) {
//  	maxiMumofSubArray(new int[] {1,2,3,4,5},2);
//  }
//}
//

//class Solution {
//    public static int longestkSubstr(String s, int k) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int length = s.length();
//        int longest = -1;
//        for(int i = 0, j = 0; i < length; i++)
//        {
//       		map.put(arrayi), map.getOrDefault(arrayi), 0) + 1);
//        	if(map.size() == k)
//        		longest = Math.max(longest, (i - j + 1));
//        	if(map.size() > k)
//        	{
//        		char c = arrayj);
//        		int value = map.get(c);
//        		if(value - 1 == 0)
//        			map.remove(c);
//        		else
//        			map.put(c, value - 1);
//        		j++;
//        	}
//        }
//        return longest;
//    }
//    
//    public static void main(String[] args)
//    {
//    	longestkSubstr("aabacbebebe", 3);
//    }
//}

// Longest Substring Without Repeating Characters
//class Solution {
//    public static int lengthOfLongestSubstring(String s) {
//    	List<Character> list = new LinkedList<>();
//        int longest = 0;      
//      
//        int length = s.length();
//        
//        for(int i = 0, j = 0;  i < length; i++)
//        {
//        	char c = arrayi);
//        	if(list.contains(c));
//        	{
//        		  int index = list.indexOf(c);
//        		  while(index >= 0)
//		          {
//		         	 list.remove(index);
//		         	 index--;
//		          }
//        	}
//        	list.add(c);
//        	longest = Math.max(longest,list.size());              
//        }
//       
//        return longest;
//    }
//    
//    public static void main(String[] args)
//    {
//    	
//    	System.out.println(lengthOfLongestSubstring("xxabcd"));
//    }
//}
//class Solution {
//    public static int removeElement(int[] nums, int val) {
//        int cnt = 0;
//        int length = nums.length;
//        for(int i = 0, j = length - 1; i < length; i++)
//        {
//            if(nums[j] == val) j--;
//            if(nums[i] == val)
//            {
//                nums[i] = nums[j];
//                cnt++;
//                j--;
//            }
//        }
//        return length - cnt;
//    }
//    
//    public static void main(String[] args)
//    {
//    	removeElement(new int[] {0,1,2,2,3,0,4,2},2);
//    }
//}
//class Solution {
//    public static int strStr(String s, String t) {
//        int m = s.length(), n = t.length();
//        int tIndex = 0;
//        if (n == 0) return 0;
//        for (int i = 0, j; i <= m - n; i++) {
//            // if (arrayi + n - 1) != t.charAt(n - 1)) continue;
//            // for (j = 0; j < n && arrayi + j) == t.charAt(j); j++);
//            // if (j == n) return i;
//            tIndex = 0;
//            if(arrayi) == t.charAt(tIndex))
//            {
//                j = i + 1;
//                tIndex++;
//                while(tIndex < n && j < m && arrayj) == t.charAt(tIndex))
//                    {tIndex++;j++;}
//                if(tIndex == n)
//                    return i;
//            }
//        }
//        return -1;
//    }
//    
//    public static void main(String[] args)
//    {
//    	strStr("mississippi"
//    			,"issip");
//    }
//}

//class Solution {
//    public static  int[] searchRange(int[] nums, int target) {
//        int array[] = new int[] {-1,-1};
//        int length = nums.length;
//        int start = 0, end = length - 1;
//        
//        while(start < end)
//        {
//            int mid = (start + end) / 2;
//            int num = nums[mid];
//            
//            if(nums[mid] < target)
//                start = mid + 1;
//            else
//                end = mid;       
//        }
//        if(nums[start] != target) return array;
//        array[0] = start;
//        
//        end = length - 1;
//        
//        while(start <= end)
//        {
//            int mid = ((start + end) / 2) + 1;
//            int num = nums[mid];
//            
//            if(nums[mid] > target)
//                end = mid - 1;
//            else
//                start = mid;            
//        }        
//        
//     
//        return array;
//    }
//    
//    public static void main(String[] args)
//    {
//    	searchRange(new int[] {5,5,5,7,7,7,8,8,10},7);
//    }
//}

//class Solution {
//    public static void sortColors(int[] nums) {
//        int length = nums.length;
//        int start = 0;
//        int end = length - 1;
//        for(int i = 0;i < end; i++)
//        {
//            if(nums[i] == 0 && nums[start]!= 0)
//            {
//                int temp = nums[start];
//                nums[start] = nums[i];
//                nums[i] = temp;
//                start++;
//                continue;
//            }
//            if(nums[i] == 2 && nums[end] != 2)
//            {
//                int temp = nums[end];
//                nums[end] = nums[i];
//                nums[i] = temp;
//                end--;
//            }
//            	
//        }
//    }
//    
//    public static void main(String[] args)
//    {
//    	sortColors(new int[] {2,0,2,1,1,0});
//    }
//}

//class Solution {
//    // int countTotalDigit(int n)
//    // {
//    //     int cnt = 1;
//    //     while(n > 0)
//    //         n/=10;
//        
//    //     return cnt;
//    // }
//    static String armstrongNumber(int n){
//        double totalDigit = Math.log10(n);
//        int temp = n;
//        int sum = 0;
//        while(n > 0)
//        {
//            int rem = n % 10;
//            sum += Math.pow(rem,(int)(totalDigit + 1));
//            n/=10;
//        }
//        if(temp == sum) return "Yes";
//        else return "No";
//        
//    }
//    
//    public static void main(String[] args)
//    {
//    	armstrongNumber(153);
//    }
//}
//class Solution {
//    public static int maximumProduct(int[] nums) {
//       PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//       PriorityQueue<Integer> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());
//       
//       int length = nums.length;
//       for(int i = 0 ; i < length;i++)
//       {
//    	   minHeap.offer(nums[i]);
//    	   maxHeap.offer(nums[i]);
//    	   
//    	   if(maxHeap.size() > 2)
//    		   maxHeap.poll();
//     	   if(minHeap.size() > 3)
//    		   minHeap.poll();
//       }
//       
//       int minHeapMax = 1, maxHeapMax =1;
//       for(int i = 0, j = 0; i < 2; i++, j++)
//       {
//    	   maxHeapMax *= maxHeap.poll();
//    	   minHeapMax *= minHeap.poll();
//       }      
//       return Math.max(minHeapMax * minHeap.peek(), maxHeapMax * minHeap.poll());       
//    }
//    
//    public static void main(String[] args)
//    {
//    	maximumProduct(new int[] {-100,-98,-1,2,3,4});
//    }
//}

//class Solution {
//    public static List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> numbers = new ArrayList<>();
//        double totalDigits = 0;
//        int temp = 0,cnt = 0;
//        while(left <= right)
//        {
//            totalDigits =(int) Math.log10(left) + 1;
//            if(totalDigits == 1)
//                numbers.add(left);
//            else
//            {
//                temp = left;
//                cnt = 0;
//                while(temp > 0)
//                {
//                    int rem = temp % 10;
//                    if(rem == 0 || !(left % rem == 0))
//                        break;
//                    temp/=10;
//                
//                    cnt++;
//                }
//                if(cnt == totalDigits)
//                    numbers.add(left);
//            }
//            left++;
//        }
//        return numbers;
//    }
//    
//    public static void main(String[] args)
//    {
//    	selfDividingNumbers(11,12);
//    }
//}
//

//class Solution {
//	
//	public static int gcd(int a, int b)
//	{
//		if(b == 0)
//			return a;
//		return gcd(b,a % b);
//	}
//    public static List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> numbers = new ArrayList<>();
//        
//        int gcd = 1;
//        while(left <= right)
//        {
//        	while(left <= 11)
//        	{
//        		numbers.add(left);
//        		left++;
//        	}
//        	int temp = left;
//        	gcd = 1;
//        	while(temp > 0)
//        	{
//        		int rem1 = temp % 10; 
//        		gcd = gcd(rem1, gcd);
//        		temp/=10;
//        	}
//        	left++;
//        }
//        return numbers;
//       
//    }
//    
//    public static void main(String[] args)
//    {
//    	selfDividingNumbers(11,12);
//    }
//}

//class Solution {
//    public static String addBinary(String a, String b) {
//        StringBuilder string = new StringBuilder();
//        
//        int aLength = a.length();
//        int bLength = b.length();
//        
//        int i = aLength - 1, j = bLength - 1;
//        int sum = 0;
//        boolean carry = false;
//        while(i >= 0 || j >= 0)
//        {
//        	carry = false;
//        	if(i < aLength) sum += a.charAt(i) - '0';
//        	if(j < bLength) sum += b.charAt(j) - '0';
//        	
//           	string.append(sum % 2);
//           	
//        	if(sum > 1)
//        	{
//        		sum = 1;
//        		carry = true;
//        	}
//        	else sum = 0;
//        	i--;
//        	j--;
//        }
//        if(carry) string.append(1);
//        return string.reverse().toString();
//    }
//    
//    public static void main(String[] args)
//    {
//    	addBinary("1010", "1011");
//    }
//}

//public class Solution {
//    // you need treat n as an unsigned value
//    public static int reverseBits(int n) {   
//    	int res=0;
//        for(int i=0;i<32;i++){
//        	res= ( res << 1 ) | ( n & 1 );         
//        	n = n >> 1;                  
//        }
//        return res;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(reverseBits(12345678));
//    }
//}

//public class Solution {
//    // you need treat n as an unsigned value
//    public static int reverse
//s(int n) {   
//       int res=0;
//        for(int i=0;i<32;i++){
//    	res = ( res << 1 ) | ( n & 1 );         
//    	n = n >> 1;                  
//         }
//    return res;
//    }
//
//    
//    public static void main(String[] args)
//  {
//  	System.out.println(reverseBits(12345678));
//  }
//}

//public class Solution {
//    // you need to treat n as an unsigned value
//    public static int hammingWeight(int n) {
//        int count = 0;
//        while(n > 0)
//        {
//            count += (n & 1);
//            n = n >> 1;
//        }
//        return count;
//    }
//    
//    public static void main(String[]  args)
//    {
//    	hammingWeight()
//    }
//}

//class Solution {
//    public static int hammingDistance(int x, int y) {
//        int count = 0;
//        while(x > 0 || y > 0)
//        {
//            if(((x & 1) == 1 && (y & 1) == 0) || (((x & 1) == 0) && ((y & 1) == 1))) count++;
//            x = x >> 1;
//            y = y >> 1;
//        }
//        return count;
//    }
//
//
//public static void main(String[] args)
//{
//	hammingDistance(1, 4);
//}
//}

//class Solution {
//    public static int findComplement(int num) {
//        int result = num;
//        int pow = 0;
//        while(result > 0)
//        {
//         //   result += Math.pow(2 * (1 ^ num), pow);
//            if(((1 << pow) & num) > 0)
//            	num = ~(1 << (pow)) & num;
//            else
//            	num = (1 << pow) | num;
//            result = result >> 1;
//            pow++;
//        }
//        
//        return num;
//    }
//    
//  public static void main(String[] args)
//  {
//	  findComplement(5);
//	  System.out.println(1 ^ 2 ^ 3);
//	  System.out.println(1 ^ 2 ^ 3 ^ 4 ^ 5);
//  }
//}

//public class Solution
//{
//	public static void Printable(int num)
//	{
//		System.out.println(num);
//		Printable(num+1);
//	}
//	public static void main(String[] args)
//	{
//		Printable(1);
//	}
//}

//------------------------- Recursion -----------------------------------
//class Solution {
//    
//    public static int search(int arr[], int target, int start, int end)
//    {
//    	 if(start > end) return -1;
//    	 
//        int mid = (start) + ((end - start) / 2);
//        if(arr[mid] == target) return mid;
//        
//        if(target > arr[mid]) 
//            return search(arr, target, mid + 1, end);
//        return search(arr, target, start, mid - 1);
//    }
//    
//    public static int search(int[] nums, int target) {
//        int length = nums.length;
//        return search(nums,target,0,length - 1);
//    }
//  
//    public static void main(String[] args)
//    {
//    	search(new int[]{-1,0,3,5,9,12},13);
//    }
//}

// ---- Important -------
// Q: find the all the index of targeted element and return list
// 1st pass list in function parameter

//public class Solution
//{
//	//passlist in argument
//	public static ArrayList<Integer> search(int arr[], int target, int index, ArrayList<Integer> arrList )
//	{
//		if(index == arr.length) return arrList;
//		if(arr[index] == target) arrList.add(index);
//		index++;
//		return search(arr, target, index, arrList);
//	}
//	
//	//not pass list as argument create in function body
//	
//	public static ArrayList<Integer> searchW(int arr[], int target, int index )
//	{
//		ArrayList<Integer> arrList = new ArrayList<>();
//		if(index == arr.length) return arrList;
//		if(arr[index] == target) arrList.add(index);
//		index++;
//		ArrayList<Integer> mergeArrayList = searchW(arr, target, index);
//		arrList.addAll(mergeArrayList);
//		return arrList;
//	}
//	
//	public static void main(String[] args)
//	{
//		System.out.println(search(new int[] {1, 2, 3, 4,4,5,6},4,0,new ArrayList<>()));
//		System.out.println(searchW(new int[] {1, 2, 3, 4,4,5,6},4,0));
//	}
//}
//
//
//	

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//class Solution {

//    public static ListNode merge(ListNode list1, ListNode list2, ListNode mergeHead)
//    {
//        ListNode temp = mergeHead;
//        while(temp.next != null) temp = temp.next;
//        if(list1 == null)
//        {
//            while(list2!=null)
//            {
//                temp.next = list2;
//                list2 = list2.next;
//                temp = temp.next;
//            }
//            return mergeHead;
//        }
//            
//        if(list2 == null)
//        {
//             while(list1!=null)
//            {
//            	 temp.next = new ListNode(list1.val);
//                list1 = list1.next;
//                 temp = temp.next;
//            }
//            return mergeHead.next;
//        }
//        
//       
//        if(list1.val < list2.val)
//        {
//            temp.next = new ListNode(list1.val);
//            list1 = list1.next;
//            return merge(list1, list2, mergeHead);
//        }
//            
//        else
//        {
//            temp.next = new ListNode(list2.val);
//            list2 = list2.next;
//            return merge(list1, list2, mergeHead);
//        }
//    }
//    
//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        return merge(list1,list2,new ListNode());
//    }

// Good solution
//		   public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		   if(list1 == null){
//		       return list2;
//		   }
//		    if(list2==null){
//		        return list1;
//		    }
//		    if(list1.val<list2.val){
//		        list1.next = mergeTwoLists(list1.next , list2);
//		        return list1;
//		    }
//		    else{
//		        list2.next = mergeTwoLists(list2.next , list1);
//		    }
//		     return list2;
//		  }
//		
//    
//	
//	
//	public static ListNode reverseList(ListNode head) {
//        
//        ListNode temp = head.next,previous=head;
//        
//        while(temp!= null)
//        {
//            temp.next = previous;
//            previous = temp;
//            temp = temp.next;
//        }
//        head = previous;
//        return head;
//    }
//    public static void main(String[] args)
//    {
//    	
//    	//ListNode n1 = new ListNode(40);
//    	ListNode n2 = new ListNode(5);
//    	ListNode n3 = new ListNode(3,n2);
//    	ListNode list1 = new ListNode(1,n3);
//    	
//    //	ListNode n4 = new ListNode(35);
//    	ListNode n5 = new ListNode(6);
//    	ListNode n6 = new ListNode(4,n5);
//    	ListNode list2 = new ListNode(2,n6);
//   
// //   	reverseList(list2);
//   	mergeTwoLists(list1,list2);
//    }
//}
////
//

//class Solution {
//	    public static  int countConsistentStrings(String allowed, String[] words) {
//	        int length = words.length;
//	        int cnt = 0, flag = 0;
//	        for(int i = 0; i < length; i++)
//	        {
//	            int j = 0;
//	            flag = 0;
//	            int wordLength = words[i].length();
//	           while(j < wordLength)
//	           {
//	               if(allowed.indexOf(words[i].charAt(j)) < 0)
//	               {
//	                   flag = 1;
//	                   break;
//	               }
//	               j++;
//	           }
//	          if(flag == 0) cnt++;
//	        }
//	        return cnt;
//	    }
//	
//	public static void main(String[] args)
//	{
//		countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"});
//	}
//	
//Good solution
//	public int countConsistentStrings(String allowed, String[] words) {
//		int count = words.length;
//		int[] store = new int[26];
//
//		for (char c : allowed.toCharArray()){
//			store[c-'a']++;
//		}
//
//		for (String word : words) {
//			
//			for (char c : word.toCharArray()) {
//				if (store[c-'a'] <= 0){
//					count--;
//					break;
//				}
//			}
//		}
//		return count;
//	}
//}
/////////////// Sorting //////////////////////////////

//Selection sort
//class Solution {
//    
//	static int  maxIndex(int []nums, int start, int end)
//	    {
//	        int max = start;
//	        for(int i = start +  1;i <= end; i++)
//	        {
//	        	if(nums[max] < nums[i])
//	        		max = i;
//	        }
//	            
//	        
//	        return max;
//	    }
//    
//    public static int[] sortArray(int[] nums) {
//        int length = nums.length;
//        int result[] = new int[length];
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < length; i++)
//        {
//            int last = length - i - 1;
//            
//            int maxindex = maxIndex(nums, 0, last);
//            
//            int temp = nums[maxindex];
//            nums[maxindex] = nums[last];
//            nums[last] = temp;
//        }
//        
//        return nums;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(sortArray(new int[] {5,4,3,1}).toString());
//    }
//}

//Insertion Sort

//class Solution {
//    
//    
//    public static int[] sortArray(int[] nums) {
//        int length = nums.length;       
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i <= length - 2; i++)
//        {
//           for(int j = i + 1; j > 0; j--)
//           {
//        	   if(nums[j] < nums[j - 1])
//        	   {
//        		   int temp = nums[j];
//                   nums[j] = nums[j - 1];
//                   nums[j - 1] = temp;
//        	   }
//        	   else {
//				break;
//			}
//           }
//            
//            
//        }
//        
//        return nums;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(sortArray(new int[] {1}).toString());
//    }
//}

//Merge Sort

//class Solution {
//   
//    
//    public static int[] sortArray(int[] nums) {
//    		if(nums.length  == 1)
//    			return nums;
//    		
//    		int mid = nums.length / 2;
//    		
//    		int left[] = sortArray(Arrays.copyOfRange(nums, 0,mid)); 
//    		int right[] = sortArray(Arrays.copyOfRange(nums, mid,nums.length));
//    		
//    		return merge(left,right);
//        }
//    
//    static int[] merge(int[] first, int second[])
//    {
//    	int i = 0,j = 0,k = 0;
//    	int mix[] = new int[first.length + second.length];
//    	
//    	while(i < first.length && j < second.length)
//    	{
//    		if(first[i] < second[j])
//    		{
//    			mix[k] = first[i];
//    			i++;
//    		}
//    		else {
//    			mix[k] = second[j];
//    			j++;
//			}
//    		k++;
//    	}
//    	
//    	while(i < first.length)
//    	{
//    		mix[k] = first[i];
//    		k++;
//    		i++;
//    	}
//    	
//    	while(j < second.length)
//    	{
//    		mix[k] = second[j];
//    		k++;
//    		j++;
//    	}
//        
//        return mix;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(sortArray(new int[] {1,0,54,-1}).toString());
//    }
//}

//Cyclic Sort
//class Solution {
//   
//	static void swap(int nums[], int i, int j)
//	{
//		int temp = nums[i];
//		nums[i] = nums[j];
//		nums[j] = temp;
//	}
//    
//    public static List<Integer> sortArray(int[] nums) {
//    		int i = 0;
//    		int length = nums.length;
//    		List<Integer> list = new LinkedList<>();
//    		while(i < nums.length)
//    		{
//    			int correctIndex = nums[i] - 1;
//    			if(nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
//				else i++; 	
//    		}  		
//    		
//    		 
////            for(int j = 0; j < length; j++)
////            {
////            	if(nums[j] != j + 1)
////            		list.add(nums[j]);
////            }
////            return list;
//            
//            for(int j = 0; j < length; j++)
//            {
//            	if(nums[j] != j + 1)
//            	{
//            		list.add(j);
//            		list.add(j+1);
//            	}
//            }
//            return list;
//    }
//    
//    
//    public static void main(String[] args)
//    {
//    	sortArray(new int[] {5,3,2,4,4});
//    }
//}

//Problems On CS
// Good solution
//class Solution {
//	   
//	static void swap(int nums[], int i, int j)
//	{
//		int temp = nums[i];
//		nums[i] = nums[j];
//		nums[j] = temp;
//	}
//    
//	 public static List<Integer> findDisappearedNumbers(int[] nums) {
//		 List<Integer> result = new LinkedList<>();
//	        int idx = -1;
//	        for(int i = 0; i < nums.length; i++){
//	        	if(nums[i] < 0) idx = nums[i] * -1 - 1;
//	        	else idx = nums[i] - 1;
//	            if(nums[idx]>0){
//	                nums[idx] = -nums[idx];
//	            }
//	            
//	        }
//	        
//	        for(int i = 0; i < nums.length; i++){
//	            if(nums[i] > 0){
//	                result.add(i+1);
//	            };
//	            
//	        }
//	        return result;
//	    }
//    
//    
//    public static void main(String[] args)
//    {
//    	findDisappearedNumbers(new int[] {5,3,1,6,2,4,2,3});
//    }
//}

//Problem
// Good solution
//public class Solution {
//    // when find a number i, flip the number at position i-1 to negative. 
//    // if the number at position i-1 is already negative, i is the number that occurs twice.
//    
//    public List<Integer> findDuplicates(int[] nums) {
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; ++i) {
//            int index = Math.abs(nums[i])-1;
//            if (nums[index] < 0)
//                res.add(Math.abs(index+1));
//            nums[index] = -nums[index];
//        }
//        return res;
//    }
//}

//Bubble Sort
//class Solution {
//
//static void swap(int nums[], int i, int j)
//{
//	int temp = nums[i];
//	nums[i] = nums[j];
//	nums[j] = temp;
//}
//
//public static void sortArray(int[] nums) {
//			int length = nums.length;
//		boolean swapped = false; // when no swap will do then means arrray is sorted
//		for(int i = 0; i < length - 1; i++)
//		{
//			swapped  = false;
//			for(int j = 0; j < (length - i - 1); j++)
//			{
//				if(nums[j] > nums[j + 1])
//				{
//					swap(nums, j, j + 1);
//					swapped = true;
//				}
//			}
//			if(!swapped)
//				break;
//		}
//}
//
//
//public static void main(String[] args)
//{
//	sortArray(new int[] {2,3,1,3,5});
//}
//}

//Remove any character from String and return

//public class Solution
//{
//	static String removeCh(String str)
//	{
//		if(str.isEmpty())
//			return "";
//		
//		char ch = str.charAt(0);
//		
//		if(ch == 'a')
//			return removeCh(str.substring(1));
//		else
//			return ch + removeCh(str.substring(1));
//	}
//	

//	static String removeString(String str)
//	{
//		if(str.isEmpty())
//			return "";
//		
//		char ch = str.charAt(0);
//		
//		if(str.startsWith("Dhrumil"))
//			return removeString(str.substring("Dhrumil".length()));
//		else
//			return ch + removeString(str.substring(1));
//	}

//	static String removeConditionfString(String str)
//	{
//		if(str.isEmpty())
//			return "";
//		
//		char ch = str.charAt(0);
//		
//		if(str.startsWith("Dhr") && !str.startsWith("Dhrumil"))
//			return removeConditionfString(str.substring("Dhr".length()));
//		else
//			return ch + removeConditionfString(str.substring(1));
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		//removeCh("dsfbasabfs");
//		//System.out.println(removeString("aaaDhrumilGohilDhrumilkjdfavdsDhrumilkjsdfgsdyf"));
//		System.out.println(removeConditionfString("aaaDhrumlGohilDhrumilkjdfavdsDhrumilkjsdfgsdyf"));
//	}
//}

//Subsets // SubSequence

//class Solution
//{
//	static ArrayList<String> createSubset(String answer, String str)
//	{
//		if(str == "")
//		{
//			ArrayList<String> list = new ArrayList<>();
//			list.add(answer);
//			return list;
//		}
//		
//		char ch = str.charAt(0);
//		
//		ArrayList<String> left =  createSubset(answer, str.substring(1));
//		ArrayList<String> right = createSubset(answer + ch , str.substring(1));
//		
//		left.addAll(right);
//		return left;
//		
//		
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		System.out.println(createSubset("","abc"));
//		
//		//Using iteration
//		int arr[] = new int[] {1,2,3};
//		
//		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
//		resultList.add(new ArrayList<>());
//		
//		for(int i = 0 ; i < 3; i++)
//		{
//			int n = resultList.size(); 
//			for(int j = 0; j < n; j++)
//			{
//				List<Integer> internaList = new ArrayList<>(resultList.get(j));
//				internaList.add(arr[i]);
//				resultList.add(internaList);
//				
//			}
//		}
//		
//		System.out.println(resultList);
//	}
//}

//DAIICT _IPC5
//}

//class Solution {
//    
//    
//    
//    public static boolean validPalindrome(String s) {
//        int start = 0; 
//        int end = s.length() - 1;
//             
//        while(start < end)
//        {
//            if(arraystart) != arrayend))
//            {          
//               if(array++start) == arrayend))
//               {
//                   while(start < end)
//                   {
//                       if(arraystart) != arrayend))
//                           return false;
//                       start++;
//                       end--;
//                   }
//                   return true;
//               }
//               else if(array--start) == array--end))
//               {
//                   while(start < end)
//                   {
//                       if(arraystart) != arrayend))
//                           return false;
//                       start++;
//                       end--;
//                   }
//                   return true;
//               }
//                else
//                    return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//    
//    public static void main(String[] args)
//    {
//    	validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
//    }
//}

//class Solution {
//    
//    public static void shift(int nums[],int start, int m)
//    {
//        while(m > start)
//        {
//            nums[m] = nums[m - 1];
//            m--;
//        }
//    }
//    
//        public static void merge(int[] num1, int m, int[] num2, int n) {
//            int num1end = m - 1;
//            int num2end = n - 1;
//            int num1last = m + n - 1;
//            while(num1end >=0 && num2end >=0)
//               num1[num1last--] = (num1[num1end] > num2[num2end]) ? num1[num1end--] : num2[num2end--];
//            .
//            while(num2end>=0)
//                num1[num1last--] = num2[num2end--];
//        }
//    
//    
//    public static void main(String[] args)
//    {
//    	merge(new int[] {4,5,6,1,2,3}, 3, new int[] {1,2,3}, 3);
//    }
//}

//class Solution {
//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new  LinkedList<List<Integer>>();
//        for(int i = 0; i < numRows; i++)
//        {
//        	if(i==0) { result.add(Arrays.asList(new Integer[] {1})); continue;};
//            for(int j = 0; j <=i; j++)
//            {
//                if(j == 0 || j == i) result.get(i).add(1);
//                else
//                    result.get(i).add(result.get(i - 1).get(j) + result.get(i - 1).get(j-1));
//            }
//        }
//        return result;
//    }
//    
//    
//    public static void main(String[] args)
//    {
//    	generate(5);
//    }
//}
//class Solution {
//    
//    public static  boolean checkPalindrome(String str,int start,int end)
//    {
//        int length = str.length();
//        while(str.charAt(start) == str.charAt(end) && start < end)
//        {start++;end--;}
//        
//        if(length % 2 == 0)
//              return start > end;
//        else
//              return start == end;
//    }
//    
//    public static String longestPalindrome(String s) {
//        int length = s.length();
//        if(length == 0) return s;
//        
//        char[] array = s.toCharArray();
//        int dp[][] = new int[length][length];
//        String result = "";
////        for(int g = 0; g < dp.length; g++)
////        {
////            for(int i = 0, j = g; j < dp[0].length; i++, j++)
////            {
////                if(g == 0)
////                {
////                    dp[i][j] = 1;
////                } 
////                else if(g == 1)
////                {
////                    if(str.charAt(i) == str.charAt(j))
////                    {
////                        dp[i][j] = 1;
////                    } 
////                } 
////                else 
////                {
////                    if(str.charAt(i) == str.charAt(j))
////                    {
////                        dp[i][j] = dp[i + 1][j - 1];
////                    }                 
////                }
////            }
////        }
//        
//        for(int i = 0; i < dp.length; i++)
//        {
//        	for(int k = 0, j = i; j < dp[0].length; j++,k++)
//        	{
//        		
//        		if(i == 0) dp[k][j] = 1;
//        		else if(i == 1) 
//        		{
//    	        	if(array[k] == array[j]) 
//    	        		dp[k][j] = 1;
//        		}
//    	        else
//    	        {
//    	        	if(array[k] == array[j] && dp[k + 1][j - 1] == 1)
//    	        		dp[k][j] = 1;    	        
//    	        }
//        		if(dp[k][j] == 1)
//        			result = s.substring(k,j+1); 
//        	}
//        }  
//        System.out.println(result);
//        for(int i = 0; i < length; i++)
//        {
//        	for(int j = 0; j < length; j++)
//        	{
//        		System.out.print(dp[i][j] + " ");
//        	}
//        	System.out.println();
//        }  
//        return "";
//    }
//    
//    public static void main(String[] args)
//    {
//    	longestPalindrome("babad");
//    }
//}
//
////class Solution {
////
////    
////    public String longestPalindrome(String s) {
////            int length = s.length();
////        if(length == 0) return s;
////        int dp[][] = new int[length][length];
////        String result = "";
////        for(int i = 0; i < length; i++)
////        {
////        	for(int k = 0, j = i; j < length; j++,k++)
////        	{
////        		if(i == 0) dp[k][j] = 1;
////        		else if(i == 1) 
////    	        	if(arrayk) == arrayj)) 
////    	        		dp[k][j] = 1;    	   
////    	        else
////    	        {
////    	        	if(arrayk) == arrayj) && dp[k + 1][j - 1] == 1)
////    	        		dp[k][j] = 1;    	        
////    	        }
////        		if(dp[k][j] == 1)
////        			result = s.substring(k,j+1); 
////        	}
////        }  
////        return result;
////    }
////}
////
////
////
////
////   
//class Solution {
//    public static List<Integer> findLonely(int[] nums) {
//        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
//        int length = nums.length;
//        for(int i = 0 ; i < length; i++)
//        {
//            
//        List<Integer> result = new LinkedList<Integer>();
//        for(Map.Entry<Integer,Integer> entry: hashmap.entrySet())
//        {
//            int val = entry.getKey();
//            if((entry.getValue() == 1) && (!(hashmap.containsKey(val - 1) || hashmap.containsKey(val + 1))))
//                result.add(val);
//        }
//        return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	findLonely(new int[] {65,49,65});
//    }
//}

//class Solution {
//    public static int maxArea(int[] height) {
//        int start = 0;
//        int end = height.length - 1;
//        int result = Integer.MIN_VALUE;
//        
//        while(start < end) {
//        	result = Math.max(result, (end - start) * Math.min(height[start], height[end]));
//        	if(height[start] < height[end])
//        		start++;
//        	else 
//        		end--;
//        }
//  
//        
//        System.out.println(result);
//        return result;
//    }
//    
//    public static void main(String[] args)
//  {
//  	maxArea(new int[] {1,8,6,2,5,4,8,3,7});
//  }
//}

//class Solution {
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        
//        result.add(new ArrayList<Integer>());
//        int length = nums.length;
//        for(int i = 0 ; i < length; i++)
//        {
//            int n = result.size();
//            for(int j = 0 ; j  < n ; j++)
//            {
//                List<Integer> inner = new ArrayList<Integer>(result.get(j));
//                inner.add(nums[i]);
//                if(!result.contains(inner))
//                    result.add(inner);
//            }
//        }
//        
//        return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	System.out.println(subsets(new int[] {1,2,2}));
//    }
//}

//Baseball Game
//class Solution {
//    public static int calPoints(String[] ops) {
//        int length = ops.length;
//        List<Integer> list = new ArrayList<Integer>();
//        int k = -1;
//        
//        for(int i =0; i < length; i++)
//        {
//            switch(ops[i])
//            {
//                case "D": {
//                         list.add(list.get(k++) * 2);
//                        break;
//                    }
//                    
//                case "C": {
//                         list.remove(k--);
//                        break;
//                    }
//                    
//                case "+":{
//                        list.add(list.get(k) + list.get(k - 1));
//                        k++;
//                        break;
//                    }
//                    
//                default: {
//                        list.add(Integer.parseInt(ops[i]));
//                        k++;
//                    }
//            }
//        }
//        
//        int size = list.size();
//        int sum = 0;
//        for(int i = 0; i < size; i++)
//            sum += list.get(i);
//        
//        return sum;
//    }
//    
//    public static void main(String[] args)
//    {
//    	calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
//    }
//}

//Stack Based Solution

//class Solution {
//    public static int calPoints(String[] ops) {
//        int length = ops.length;
//       Stack<Integer> stack = new Stack<>();
//       int k = -1;
//       int sum = 0;
//       for(int i =0; i < length; i++)
//         {
//             switch(ops[i])
//             {
//                 case "D": {
//                         stack.add(stack.lastElement() * 2);
//                         break;
//                     }
//                     
//                 case "C": {
//                         stack.pop();
//                         break;
//                     }
//                     
//                 case "+":{
//                	     stack.add(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
//                         break;
//                     }
//                     
//                 default: {
//                	  
//                       stack.add(Integer.parseInt(ops[i]));
//                     }
//             }
//         }
//	     int size = stack.size();	 
//	     for(int i = 0; i < size; i++)
//	         sum += stack.get(i);
//	     
//	     System.out.println(sum);
//	     return sum;
// 
//       }
//    
//    public static void main(String[] args)
//    {
//    	calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
//    }
//}

//Shift 2D Grid

//class Solution {
//    
//    public static  boolean validNeighbour(int mat[][], int row,int column)
//    {
//        return ((row >=0 && row < mat.length) && ((column >=0 && column < mat[0].length))); 
//    }
//     
//    public static void gameOfLife(int[][] board) {
//        int row = board.length;
//        int column = board[0].length;
//        
//        int x[] = new int[]{1,1,0,-1,-1,-1,0,1};
//        int y[] = new int[]{0,-1,-1,-1,0,1,1,1};
//        
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < column; j++)
//            {
//                int validNeighbourcnt = 0;
//                for(int k = 0; k < 8; k++)
//                {
//                    if(validNeighbour(board, (i + x[k]), (j+y[k])) && (board[i + x[k]][j+y[k]] == 1 || board[i + x[k]][j+y[k]] ==2))
//                       validNeighbourcnt++;
//                }
//                if(validNeighbourcnt < 2 || validNeighbourcnt > 3)
//                       board[i][j] = (board[i][j] == 1)? 2 : 0;
//                else if(validNeighbourcnt == 3)
//                       board[i][j] = (board[i][j] == 0)? -1 : 1;
//            }
//        }
//        
//        for(int i = 0; i < row; i++)
//        {
//            for(int j = 0; j < column; j++)
//            {
//               if(board[i][j] == 2) { board[i][j] = 0;continue;}
//               if(board[i][j] == -1) { board[i][j] = 1;}
//            }
//        }
//    }
//    
//    public static void main(String[] args)
//    {
//    	gameOfLife(new int[][] {{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
//    }
//}

//class Solution {
//    
//    public static boolean checkAnagram(String str1, String str2)
//    {
//        char arr1[] = str1.toCharArray();
//        char arr2[] = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        
//        return Arrays.equals(arr1,arr2);
//    }
//    public static  List<List<String>> groupAnagrams(String[] strs) {
//        int length = strs.length;
//   
//        List<List<String>> result = new ArrayList<List<String>>();
//        
//        
//        for(int i = 0; i < length; i++)
//        {
//            if(strs[i] == "*") continue;
//            List<String> list = new ArrayList<String>();
//            list.add(strs[i]);
//            for(int j = i+1; j < length; j++)
//            {
//                if(checkAnagram(strs[i],strs[j]))
//                {
//                    list.add(strs[j]);
//                    strs[j] = "*";
//                }
//            }
//            result.add(list);
//        }
//                   
//    return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
//    }
//}

//3Sum
//class Solution {
//	  public static  List<List<Integer>> threeSum(int[] nums) {
//			 int length= nums.length;
//			 List<List<Integer>> result = new ArrayList<List<Integer>>();
//			 
//			 Arrays.sort(nums);
//			 
//			 for(int i = 0;i < length; i++)
//			 {
//	             if(nums[i] > 0)
//	                 break;
//				 List<Integer> arrayList = new ArrayList<>();
//				 arrayList.add(nums[i]);
//				 for(int j = i + 1; j < length; j++)
//				 {
//	                 if(nums[i] + nums[j] > 0)
//	                     break;
//					 arrayList.add(nums[j]);
//					 for(int k = j+1; k < length; k++)
//					 { int sum = nums[i] + nums[j] + nums[k];
//						 if(sum > 0)
//							 break;
//						 if(sum == 0)
//						 {
//							 arrayList.add(nums[k]);
//							 if(!result.contains(arrayList))
//								 result.add(new ArrayList<Integer>(arrayList));
//							 arrayList.remove(2);
//						 }
//					 }
//					 arrayList.remove(1);
//				 }
//			 }
//			 System.out.println(result);
//			 return result;
//		  }
//
//   
//    
//    public static void main(String[] args)
//    {
//    	threeSum(new int[] {-1,0,1,2,-1,-4});
//    }
//}
//
//3 sum better approach
//public static  List<List<Integer>> threeSum(int[] nums) {
// // 		 int length= nums.length;
// //            HashSet<Integer> set = new HashSet<>();

// //            for(int i = 0;i < length; i++)
// //                set.add(nums[i]);

// //            Object arr[] = set.toArray();
// //            int newlength = arr.length; 
// // 		 List<List<Integer>> result = new ArrayList<List<Integer>>();

// // 		 Arrays.sort(arr);

// // 		 for(int i = 0;i < newlength; i++)
// // 		 {
// //                 int remaining = 0 - arr[i];
// //                 int start = i+1;
// //                 int end = length - 1;

// //                 while(start < end)
// //                 {
// //                      int twoSum = arr[start] + arr[end];
// //                     if(twoSum > remaining) end--;
// //                     else if(twoSum < remaining ) start++;
// //                     else
// //                     {
// //                         List<Integer> list = new LinkedList<Integer>();
// //                         list.add(arr[i]);
// //                         list.add(arr[start]);
// //                         list.add(arr[end]);

// //                         result.add(list);

// //                         start++;
// //                        end--;
// //                     }
// //                  }
// //          //    while(i+1 <= length - 1&& nums[i] == nums[i + 1]) i++;
// // 	     }
// //     return result;
// // }
// Remove Duplicate Element

//Remove K digit

//public class Solution{
//    public static void removeKdigits(String num, int k) {
//        char chArray[] = num.toCharArray();
//        int cnt = 0;
//        
//        Stack<Integer> stack = new Stack<>();
//        stack.push(num.charAt(0) - '0');
//        
//        int length = num.length();
//        int i;
//        for(i = 1; i < length; i++)
//        {
//        	int n = chArray[i] - '0';
//        	
//        	while((!(stack.isEmpty()) && (stack.peek()) > n) && cnt < k)
//        	{
//        		cnt++;
//        		stack.pop();
//        	}
//        	
//        	if((stack.isEmpty() && n == 0))
//        		continue;
//        	stack.push(n);
//        }
//        
//        StringBuilder result = new StringBuilder();
//        
//        while(!stack.isEmpty())
//        	result.append(stack.pop());        
//        System.out.println(result.length() > 0);
//    }
//    
//    public static void main(String[] args)
//    {
//    	removeKdigits("10200", 1);
//    }
//}

//class Solution {
//    public static int threeSumClosest(int[] nums, int target) {
//    	Arrays.sort(nums);
//        int start = 0, end;
//        int length = nums.length;
//        end = length - 1;
//        int i = 0;
//        int result = 0;
//        int minDiff = Integer.MAX_VALUE;
//        while(i < length)
//        {
//        	start = i + 1;
//        	end = length - 1;
//        	
//        	while(start < end)
//        	{
//        		int sum = nums[i] + nums[start] + nums[end];
//        		
//        		if(sum == target)
//        			return sum;
//        		
//        		else if(Math.abs(sum - target) < minDiff)
//        		{
//        			minDiff = Math.abs(sum - target);
//        			result = sum;
//        		}
//        		
//        		if(sum > target) end--;
//        		else start++;
//        	}
//        	i++;
//        }
//        
//        System.out.println(minDiff);
//        return result;
//        
//    }
//    
//    public static void main(String[] args)
//    {
//    	
//    	threeSumClosest(new int[] {-1,2,1,-4}, 1);
//    
//    }
//}

//class Solution {
//    
//    static boolean isAnagram(String s, String t)
//    {
//          int array[] = new int[26];
//        int len = s.length();
//         for(int j = 0;j < len; j++)
//         {
//           array[s.charAt(j) - 'a']++;
//            array[t.charAt(j) - 'a']--;
//         }
//        
//        for(int j = 0;j < 26; j++)
//        {
//            if(array[j] != 0)
//                return false;
//        }
//        return true;
//    }
//    
//    public static List<Integer> findAnagrams(String s, String p) {
//        
//        int length = s.length();
//        int pLength = p.length();
//        List<Integer> result = new LinkedList<Integer>();
//        for(int i = 0; i < length - pLength; i++)
//        {
//            char ch = s.charAt(i);
//            if(p.indexOf(ch) >= 0)
//            {
//                if(isAnagram(s.substring(i,i + pLength),p))
//                    result.add(i);
//            }
//        }
//        return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	findAnagrams("cbaebabacd","abc");
//    }
//}

//class Solution {
//    public static int maxOperations(int[] nums, int k) {
//    	int length = nums.length;
//    	List<Integer> list = new ArrayList<>(length);
//    	
//    	Arrays.sort(nums);
//    	
//        for (int i: nums) {
//            list.add(Integer.valueOf(i));
//        }
//        
//        int cnt = 0;
//        int start = 0;
//        int end = length - 1;
//       while(start < end)
//        {
//        	int num1 = list.get(start);
//        	int num2 = list.get(end);
//        	int sum = num1 + num2;
//        	
//        	if(sum == k)
//        	{
//        		start++;
//        		end--;
//        		cnt++;
//        	}
//        	else if(sum > k) end--;
//        	else start++;
//        }
//        
//        System.out.print(cnt);
//        return cnt;
//        
//    }
//    
//    public static void main(String[]args)
//    {
//    	maxOperations(new int[] {1,2,3,4},5);
//    }
//}
//class Solution {
//    public static boolean   isSubsequence(String s, String t) {
//        int freq[] = new int[26];
//        int sLength = s.length();
//        int tLength = t.length();
//        
//        for(int i =0;i < tLength; i++)
//            ++freq[t.charAt(i) - 'a'];
//        
//        for(int i =0;i < sLength; i++){
//            if(--freq[s.charAt(i) - 'a'] < 0)
//                return false;
//        }
//        return false;
//    }
//    
//    public static void main(String[] args)
//    {
//    	isSubsequence("abc",  "ahbgdc");
//    }
//}

//class Solution {
//    public static void setZeroes(int[][] matrix) {
//        int m = matrix.length - 1;
//        int n = matrix[0].length - 1;
//
//        for(int i = 0; i <= m; i++)
//        {
//            for(int j = 0 ; j <= n; j++)
//            {
//                if(matrix[i][j] == 0)
//                {
//                    for(int k = 0; k <= n; k++)
//                        if( matrix[i][k] != 0) matrix[i][k] = -1;
//                    for(int l = 0; l <= m; l++)
//                    	if(matrix[i][j] != 0) matrix[l][j] = -1;
//                }
//            }
//        }
//        
//        for(int i = 0; i <= m; i++)
//        {
//            for(int j = 0 ; j <= n; j++)
//            {
//                if(matrix[i][j] == -1)
//                     matrix[i][j] = 0;
//            }
//        }
//    }
//    
//    public static void main(String[]args)
//    {
//    	int arr[][]= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//    	setZeroes(arr);
//    }
//}
//public class Solution {
//    public static List<List<Integer>> generate(int numRows)
//    {
//        List<List<Integer>> result = new LinkedList<List<Integer>>();
//        List<Integer> temp = new LinkedList<>();
////            
////        for(int i = 0 ; i < numRows; i++)
////        {
////            temp.add(0,1);
////            for(int j = 1; j < temp.size() - 1; j++)
////                temp.set(j,temp.get(j) + temp.get(j + 1));
////            result.add(new LinkedList<Integer>(temp));
////        }
////        
////        return result;
//    	for(int i = 0;i < numRows; i++)
//        {
//            for(int j = 0; j < i+1; j++)
//            {
//                if(j == 0 || j == i)
//                    temp.add(1);
//                else
//                    temp.add(result.get(i-1).get(j-1) + result.get(i - 1).get(j));
//            }
//            result.add(new LinkedList<Integer>(temp));
//        }
//        return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	generate(5);
//    }
//}

//class Solution {
//    
//    
//    public static void swap(int []nums, int index1, int index2)
//    {
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//    }
//    
//    public static void reverse(int []nums, int index1,int index2)
//    {
//        while(index1 < index2) swap(nums, index1++, index2--);
//    }
//    
//    public static void nextPermutation(int[] nums) {
//      int length = nums.length;
//      int i = length - 2;
//        
//        // Find peak Element from Rightside
//        while(i >= 0 && nums[i] > nums[i + 1]) i--;
//        if(i >= 0)
//        {
//            int j = length - 1;
//            while(j > 0 && nums[j] <= nums[i]) j--;
//            swap(nums, i , j);
//        }
//        reverse(nums, i + 1, length - 1);
//    }
//    
//    public static void main(String[] args)
//    {
//    	nextPermutation(new int[] {1,1});
//    	
//    }
//   
//}
//class Solution {
//    
//    
//    public static void swap(int []nums, int index1, int index2)
//    {
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//    }
//    
//    public static void reverse(int []nums, int index1,int index2)
//    {
//        while(index1 < index2) swap(nums, index1++, index2--);
//    }
//    
//    public static void nextPermutation(int[] nums) {
//      int length = nums.length;
//      int i = length - 2;
//          
//    while(i >= 0 && nums[i] >= nums[i + 1]) i--;
//    if(i < 0)
//    {
//        int j = length - 1;
//        reverse(nums, i + 1, j);
//        return;
//    }
//    
//    int lastInc = i + 1;
//    int index = i + 1;
//    for(int j = lastInc; j < length; j++)
//    {
//        if(nums[j] > nums[i] && nums[j] < nums[index])
//        {
//            index = j;            
//        }
//    }
//    swap(nums, i,index);
//    Arrays.sort(nums, lastInc, length);
//    }
//    public static void main(String[] args)
//    {
//    	nextPermutation(new int[] {1,3,2});
//    }
//}
//class Solution {
//    public static int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE;
//        int length = prices.length;
//        int minIndex = 0;
//        int max = Integer.MIN_VALUE;
//        int maxIndex = 0;
//        for(int i = 0;  i < length; i++)
//        {
//            if(prices[i] > max) 
//            {
//            	max = prices[i];
//                maxIndex = i;
//            }
//        }
//        
//        if(maxIndex == 0) return 0;
//        
//        for(int i = maxIndex - 1; i >= 0; i--)
//        {
//            if(prices[i] < min) 
//            {
//            	min = prices[i];
//                minIndex = i;
//            }
//        }
//       
//        return prices[maxIndex] - prices[minIndex];
//    }
//    
//    public static void main(String[] args)
//    {
//    	maxProfit(new int[] {7,1,5,3,6,4});
//    }
//}

//class Solution {
//
//    public static int findDuplicate(int[] nums) {
//    	
//        int length = nums.length;
//        
//        for(int i = 0; i < length; i++)
//        {
//        	if( nums[Math.abs(nums[i])] < 0) return i;
//        	else nums[Math.abs(nums[i])] = - nums[Math.abs(nums[i])];
//        }
//        return 0;
//    }
//    
//    public static void main(String[] args)
//    {
//    	findDuplicate(new int[] {1,3,4,2,2});
//    }
//}

////HEAP
//
//
//// Construct Heap
//
//class Solution
//{
//	
//	static void deleteNode(int arr[], int deleteIndex)
//	{
//		int length = arr.length;
//		arr[deleteIndex] = arr[length - 1];
//		
//		heapify(arr, deleteIndex);
//		
//	}
//	
//	static void heapifyInsert(int []arr, int index)
//	{
//		int parent = (index - 1) /2;
//		
//		if(arr[parent] > 0)
//		{
//			if(arr[index] > arr[parent])
//			{
//				int temp = arr[parent];
//				arr[parent] = arr[index];
//				arr[index]= temp;
//				
//				heapifyInsert(arr, parent);
//			}
//		}
//	}
//	
//	static void insertNode(int arr[])
//	{
//		arr[arr.length - 1] = 15;
//				
//		heapifyInsert(arr, arr.length - 1);
//	}
//	
//	
//	static void heapify(int arr[], int heapifyIndex)
//	{
//		int largest = heapifyIndex;
//		int minimum = heapifyIndex;
//		int left = heapifyIndex * 2  + 1;
//		int right = heapifyIndex * 2  + 2;
//		int length = arr.length;
//		
////		MaxHeap
//		if(left < length && arr[left] > arr[largest])
//			largest = left;
//		if(right < length && arr[right] > arr[largest])
//			largest = right;
//		
//		//minHeap
////		if(left < length && arr[left] < arr[largest])
////			minimum = left;
////		if(right < length && arr[right] < arr[largest])
////			minimum = right;
//
//		if(largest != heapifyIndex)
//		{
//			int temp = arr[heapifyIndex];
//			arr[heapifyIndex] = arr[largest];
//			arr[largest] = temp;
//			
//			heapify(arr, largest);
//		}
////		if(minimum != heapifyIndex)
////		{
////			int temp = arr[heapifyIndex];
////			arr[heapifyIndex] = arr[minimum];
////			arr[minimum] = temp;
////			
////			heapify(arr, minimum);
////		}
//	}
//	
//	static void buildHeap(int []arr)
//	{
//		int startIndex = arr.length / 2 - 1;
//		
//		for(int i = startIndex; i>=0; i--)
//			heapify(arr, i);
//	}
//	static int[] arr = new int[6];
//	public static void main(String[] args)
//	{
//		arr[0] = 10;
//		arr[1] = 5;
//		arr[2] = 3;
//		arr[3] = 2;
//		arr[4] = 1;
//		
//		buildHeap(arr);
//		
//		deleteNode(arr, 1);
//		
//		deleteNode(arr, 0);
//		
//	//	insertNode(arr);
//		
//		System.out.println(arr[0]);
//		
//	}
//}

//class Solution {
//	
//	
//	   
//    static boolean search(int arr[], int start, int end, int mid, int target)
//    {
//    	if(start >= mid) return false;
//        int m = start +  (end - start) / 2;
//        if(arr[m] == target) return true;
//        if(arr[m] > target) return search(arr, start, m - 1,m, target);
//        else return search(arr, start, mid + 1,m, target);
//    }
//    
//	
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        int totalRow = matrix.length;
//        int totalColumn = matrix[0].length;
//        int row = -1;
//        for(int i = 0 ; i  < totalRow; i++)
//        {
//        	 if(target <= matrix[i][totalColumn - 1]){
//                row = i;
//                break;
//            }
//        }
//        if(row == -1) return false;
//        else return search(matrix[row],0,matrix[row].length - 1,(0+(matrix[row].length - 1 -0)/2), target);
//        
////        for(int i = 0 ; i  < totalColumn; i++)
////        {
////            if(matrix[row][i] == target) return true;
////        }
////        
////        return false;
//    }
//    
//    public static void main(String[] args)
//    {
//    	int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
////    	int matrix[][] = {{1}};
//    	searchMatrix(matrix, 3);
//    }
//}

//class Solution {
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        int length = nums.length;
//        Arrays.sort(nums);
//        List<List<Integer>> result = new LinkedList<>();
////         for(int i = 0; i < length - 3; i++)
////         {
////             for(int j = i+1; j < length - 2; j++)
////             {
////                         int start = j + 1;
////                         int end = length - 1;
////                         while(start < end)
////                         {
////                             int sum = nums[i] + nums[j] + nums[start] + nums[end];
////                             if(sum == target)
////                             {
////                                 LinkedList<Integer> list = new LinkedList<>();
////                                 list.add(nums[i]);
////                                 list.add(nums[j]);
////                                 list.add(nums[start]);
////                                 list.add(nums[end]);
//
////                                 Collections.sort(list);
//
////                                 if(!result.contains(list))
////                                     result.add(list);
////                             }
//                            
////                             if(sum > target) end--;
////                             else start++;
//                                
////                         }
////                     }
////         }
////         return result;
//        
//        
//        for(int i = 0; i < length - 3; i++)
//        {
//            for(int j = i + 1; j < length - 2; j++)
//            {
//                int start = j + 1;
//                int end = length - 1;
//                
//                while(start < end)
//                {
//                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
//                    
//                    if(sum  == target)
//                    {
//                         LinkedList<Integer> list = new LinkedList<>();
//                        list.add(nums[i]);
//                        list.add(nums[j]);
//                        list.add(nums[start]);
//                        list.add(nums[end]);
//                        
//                        result.add(list);
//                        
//                      //  while(start < end && nums[start] == nums[start + 1]) start++;
//                      //  while(start < end &&nums[end] == nums[end - 1]) end--;
//                    }
//                    if(sum > target) end--;
//                    else start++;
//                }
//            }
//        }
//        return result;
//    }
//    
//    public static void main(String args[])
//    {
//    	fourSum(new int[] {1,0,-1,0,-2,2}, 0);
//    }
//}
//class Solution {
//public static int longestConsecutive(int[] nums) {
//	  int max = 0;
//	  
//	  Set<Integer> set = new HashSet<Integer>();
//	  for (int i = 0; i < nums.length; i++) {
//	    set.add(nums[i]);
//	  }
//	  
//	  for (int i = 0; i < nums.length; i++) {
//	    int count = 1;
//	    
//	    // look left
//	    int num = nums[i];
//	    while (set.contains(--num)) {
//	      count++;
//	      set.remove(num);
//	    }
//	    
//	    // look right
//	    num = nums[i];
//	    while (set.contains(++num)) {
//	      count++;
//	      set.remove(num);
//	    }
//	    
//	    max = Math.max(max, count);
//	  }
//	  
//	  return max;
//	}
//
//	public static void main(String[] args)
//	{
//		longestConsecutive(new int[] {100,4,200,1,3,2});
//	}
//}

//public class Solution {
//
////	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
////        int length = arr.size();
////        int maxSeq = 0;
////        int sum = 0;
//////         for(int i = 0 ; i < length; i++)
//////         {
//////             sum  = 0;
//////             for(int j = i; j < length; j++)
//////             {
//////                 sum += arr.get(j);
//////                 if(sum == 0) {
//////                     maxSeq = Math.max(j - i + 1, maxSeq);                
//////                 }
//////             }
//////         }
//////         return maxSeq;
////       int prefix[] = new int[length];
////       prefix[0] = arr.get(0);
////       for(int i = 1; i < length; i++)
////           prefix[i] = prefix[i - 1] + arr.get(i);
////        HashMap<Integer,Integer>  hashmap = new HashMap<>();
////        for(int i = 0; i < length; i++)
////        {
////            if(hashmap.containsKey(prefix[i]))
////                 maxSeq = Math.max(i - hashmap.get(prefix[i]) + 1, maxSeq); 
////            else 
////                   hashmap.put(prefix[i], i);
////        }
////        return maxSeq;
////        
////	}
//	 static int maxLen(int arr[])
//	    {
//	        // Creates an empty hashMap hM
//	        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
//	 
//	        int sum = 0; // Initialize sum of elements
//	        int max_len = 0; // Initialize result
//	 
//	        // Traverse through the given array
//	        for (int i = 0; i < arr.length; i++) {
//	            // Add current element to sum
//	            sum += arr[i];
//	 
//	            if (arr[i] == 0 && max_len == 0)
//	                max_len = 1;
//	 
//	            if (sum == 0)
//	                max_len = i + 1;
//	 
//	            // Look this sum in hash table
//	            Integer prev_i = hM.get(sum);
//	 
//	            // If this sum is seen before, then update max_len
//	            // if required
//	            if (prev_i != null)
//	                max_len = Math.max(max_len, i - prev_i);
//	            else // Else put this sum in hash table
//	                hM.put(sum, i);
//	        }
//	 
//	        return max_len;
//	    }
//	 
//	
//	public static void main(String [] args)
//	{
//		maxLen(new int[] {59, 11, -70, 82, -82});
//	}
//}

//class Solution {
//    public static int uniquePaths(int m, int n) {
//        
//        int result[][] = new int[m][n];
//        
//        for(int i = 0; i < m; i++)
//        {
//            for(int j = 0; j < n; j++)
//            {
//                if(j == 0 || i == 0)
//                    result[i][j] = 1;
//                else
//                    result[i][j] = result[i-1][j] + result[i][j - 1];
//            }
//        }
//        
//        return result[m-1][n-1];
//    }
//    
//    public static void main(String[] args)
//    {
//    	uniquePaths(3,7);
//    }
//}

// Definition for singly-linked list.

//class Solution
//{
////	  public ListNode reverseList(ListNode head) {
////	        
////	        ListNode temp = head, pre = null, next;
////	        while(temp.next != null)
////	        {
////	            next = temp;
////	            temp.next = pre;
////	            pre = temp;
////	            temp = next.next;
////	            head = temp;
////	        }
////	        return head;
////	        
////	       //return reversetheList(null,head);
////	    }
//	static ListNode newListHead = null;
//    static ListNode newListPointer = null;
//   static void addNode(int val)
//   {
//        ListNode newNode = new ListNode(val);
//       newNode.next = null;
//        if(newListHead == null) {
//            newListHead = newNode;
//            return;
//        }
//        ListNode temp = newListHead;
//        while(temp.next != null)
//            temp = temp.next;
//        temp.next = newNode;
//   }
//    
//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//       // return merge(list1,list2,new ListNode());
//       
//        ListNode pre = null;
//        if(list1 == null) return list2;
//        if(list2 == null) return list1;
//
//        while(list1!=null && list2 != null)
//        {
//            if(list1.val <= list2.val){
//               addNode(list1.val);
//                list1 = list1.next;
//            }
//            else
//            {
//                addNode(list2.val);
//                list2 = list2.next;
//            }
//        } 
//         while(list2!=null) { addNode(list2.val); list2 = list2.next;}
//         while(list1!=null) { addNode(list1.val);list1 = list1.next;}
//        return newListHead;
//        
//     
//    }
//	public static void main(String [] args)
//	{
//		ListNode head1 = new ListNode(5);
//		ListNode head2 = new ListNode(1);
//		head2.next = new ListNode(2);
//		head2.next.next = new ListNode(4);
//		
//		mergeTwoLists(head1,head2);
//	}
//}
/**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode() {}
  *     ListNode(int val) { this.val = val; }
  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  * }
  */
// class Solution {
//     
//     static ListNode reverse(ListNode pre, ListNode current)
//     {
//         if(current == null) return null;
//         
//         ListNode head = (current.next != null) ? reverse(current, current.next) : current;
//         current.next = pre;
//         return head;
//     }
//     static ListNode newListHead = null;
//     
//     void addNode(int val)
//     {
//    	 ListNode newNode = new ListNode(val);
//    	 if(newListHead == null) {newListHead = newNode;return;}
//    	 ListNode temp = newListHead;
//    	 while(temp.next != null) temp = temp.next;
//    	 temp.next = newNode;
//     }
//     public static ListNode reverseKGroup(ListNode head, int k) {
//        ListNode temp = head;
//        ListNode temp1 = head;
//        
//        int cnt = 1;
//        while(temp1!= null)
//        {
//            if(cnt % k == 0)
//            {
//                temp = temp1;
//                temp1 = temp1.next;
//                ListNode revHead = reverse(null,newListHead);
//                while(revHead.next != null) { 
//                    revHead = revHead.next;}
//                revHead.next = temp1;
//                newListHead = null;
//            }
//            temp1 = temp1.next;
//            cnt++;
//        }
//         return head;        
//     }
//     
//     public static void main(String[] args)
//     {
// 		ListNode head1 = new ListNode(1);
// 		head1.next = new ListNode(2);
// 		head1.next.next = new ListNode(3);
// 		head1.next.next = new ListNode(4);
// 		head1.next.next.next = new ListNode(5);
// 	
// 		reverseKGroup(head1, 2);
//     }
// }

//class Solution {
//	 public static  int removeDuplicates(int[] nums) 
//    {
//       int cnt = 1;
//       for(int i = 1, j = 0; i < nums.length; i++)
//       {
//    	   if(nums[i] != nums[i - 1])
//    	   {
//    		   nums[cnt] = nums[i];
//    		   cnt++;    		
//    	   }
//       }
//       return cnt;
//    }
//   
//     
//     public static void main(String[] args)
//     {
//    	 removeDuplicates(new int[] {1,1,2,2,2,3,3,4,4,4});
//     }
// }

// class Solution {
//	    public static List<List<Integer>> threeSum(int[] nums) 
//	    {
//			// HashSet<List<Integer>> res = new HashSet<>();// to avoid duplicate triplet
//			// //Array needs to be sorted, so that later when its added to the set, its easier to match the triplet
//			// Arrays.sort(nums);
//			// for(int i=0;i<nums.length;i++)
//			// {
//			// int j=i+1;
//			// int k=nums.length-1;
//			// while(j<k)
//			// {
//			// if(nums[i]+nums[j]+nums[k]==0)
//			// {
//			// List<Integer> temp = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k]));
//			// if(res.contains(temp)==false)//check if duplicate is not present
//			// res.add(temp);
//			// j++;
//			// k--;
//			// }
//			// else if(nums[i]+nums[j]+nums[k]>0)
//			// k--;
//			// else 
//			// j++;
//			// }
//			// }    
//			// return new ArrayList<>(res);
//	        
//	        
//	        // 1st Solution 2 pointer + Binary search
//	        Arrays.sort(nums);
//	        LinkedList<List<Integer>> result = new LinkedList<>();
//	        
//	        
//	        
//	        int length = nums.length;
////	         for(int i = 0 ; i < length - 2; i++)
////	         {
////	             for(int j = i+1; j < length; j++)
////	             {
////	                 //Binary search
////	                 int start = j+1;
////	                 int end = length- 1;
//	                
////	                 int rem = 0 - (nums[i]  + nums[j]);
//	                
////	                 while(start <= end)
////	                 {
////	                     int mid = start + (end - start) / 2;
//	                    
////	                     if(nums[mid] == rem)
////	                     {
////	                         LinkedList list = new LinkedList<>();
//	                        
////	                         list.add(nums[i]);
////	                         list.add(nums[j]);
////	                         list.add(nums[mid]);
//	                        
//	                        
////	                         result.add(list);
////	                         break;
////	                     }
////	                     else if(rem > nums[mid]) start = mid + 1;
////	                     else end = mid - 1;
//	                    
////	                 }
//	               
//	              
////	             }
////	         }
//	        
////	         return new ArrayList<List<Integer>>(result);
//	        
//	        // 2nd 1pointer + 2 pointer approach
//	        for(int i = 0; i < length; i++)
//	        {
//	            int start = i + 1;
//	            int end = length - 1;
//	            
//	            while(start < end)
//	            {
//	                int sum = nums[start] + nums[end] + nums[i];
//	                if(sum == 0)
//	                {
//	                     LinkedList<Integer> list = new LinkedList<>();
//	                        
//	                    list.add(nums[i]);
//	                    list.add(nums[start]);
//	                    list.add(nums[end]);
//
//
//	                    result.add(list);
//	                    while(start < end && nums[start] == nums[start + 1]) start++;
//	                    while(start < end &&nums[end] == nums[end - 1]) end--;
//	                    
//	                    
//	                    // while(start < end && nums[start] == nums[start+1]) start++;
//	                    // while(start < end && nums[end] == nums[end - 1]) end--;
//	                }
//	                
//	                else if(sum > 0) end--;
//	                else start++;                
//	            }
//	            while(i < length - 2 && nums[i] == nums[i+1]) i++;
//	        }
//	        
//	        return result;
//		}  
//	    
//	    public static void main(String[] args)
//	    {
//	    	threeSum(new int[] {-1,0,1,2,-1,-4});
//	    }
//	}

// }

// class Solution 
// {
//     //Function to find the maximum number of meetings that can
//     //be performed in a meeting room.
//     static void swap(int[] arr, int i, int j)
//     {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//    public static int maxMeetings(int start[], int end[], int n)
//     {
//    	  int sLength = start.length;
//          int eLength = end.length;
//          boolean swap = false;
//          for(int i = 0; i < sLength - 1; i++)
//          {
//              swap = false;
//              for(int j = 0; j < eLength - 1; j++)
//              {
//                  if(end[j] > end[j+1]){
//                      swap = true;
//                      swap(start,j,j+1);
//                      swap(end, j, j+1);
//                  }
//              }
//              if(!swap) break;
//          }
//          int cnt = 1;
//          int maxMeetEndTime = end[0];
//          for(int i = 1; i < sLength;i++)
//          {
//        	  if(maxMeetEndTime < start[i])
//        	  {
//        		  cnt++;
//        		  maxMeetEndTime = end[i];
//        	  }
//          }
//          
//          return cnt;
//     }
//    
//    public static void main(String [] args)
//    {
//    	int start[] = new int[]{1,3,0,5,8,5};
//    	int end[] = new int[]{2,4,6,7,9,9};
//    	
//    	maxMeetings(start, end, start.length);
//    }
// }

// class Solution {
//	    public static String reverseWords(String s) {
//////	        String result = "";
//////	        s = s.trim();
//////	        int length = s.length();
//////	        int lastIndex = 0;
//////	        while(s.lastIndexOf(" ") >= 0)
//////	        {
//////	            lastIndex = s.lastIndexOf(" ");
//////	            result += s.substring(lastIndex+1, length) + " ";
//////	            s = s.substring(0,lastIndex).trim();
//////	            length = s.length();
//////	        }
////	        return result;
//	    	 int left = 0;
//	         int right = s.length() - 1;
//	         
//	         String temp = "";
//	         String answer = "";
//	         
//	         while(left <= right)
//	         {
//	             char ch = s.charAt(left);
//	             if(ch != ' ') temp += ch;
//	             else 
//	             {
//	                 if(answer.length() < 1) answer = temp;
//	                 else {
//	                     answer = temp + " " + answer;
//	                 }
//	                 temp = "";
// 	             }
//	             while(s.charAt(left) == ' ') left++;
//	             //left++;
//	         }
//	         
//	         if(temp.length() > 0)
//	         {
//	                 if(answer.length() < 1) answer = temp;
//	                 else {
//	                     answer = temp + " " + answer;
//	                 }
//	         }
//	         return answer;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	reverseWords("the sky is blue");
//	    }
//	}

// class Solution {
//	    public static  String longestCommonPrefix(String[] strs) {
//	       String preFix = strs[0];
//	        
//	        for(int i = 0 ; i < strs.length; i++)
//	        {
//	            while(strs[i].indexOf(preFix) != 0)
//	                preFix = preFix.substring(0, preFix.length() - 1);
//	            
//	            if(preFix.length() == 0)
//	                break;
//	        }
//	        return preFix;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	longestCommonPrefix(new String[] {"flower","flow","flight"});
//	    }
//	}

// Definition for singly-linked list.
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }

// class Solution {
//
//	   
//	    public static ListNode reverseKGroup(ListNode head, int k) {
//		    ListNode current = null;
//		    ListNode previous = null;
//	        ListNode temp = head;
//	        ListNode temp1 = null;	       
//	        int cnt = 0;
//	        
//	        while(temp != null) {cnt++;temp = temp.next;}
//	        
//	        int x = cnt / k;
//	        temp = head;
//	        for(int i = 0; i < x; i++)
//	        {
//	            ListNode tail = null;
//	            for(int j = 0; j < k; j++)
//	            {      
//	            	ListNode newNode = new ListNode(temp.val);
//	                if(current == null){
//	                	current = newNode;
//	                	tail = current;}
//	                else{
//	                    newNode.next = current;
//	                    current = newNode;
//	                }
//	                temp = temp.next;
//	            }
//	           
//	            if(previous == null) previous = current;
//	            else{ temp1 = previous;
//	            	while(temp1.next != null)
//	            		temp1 = temp1.next;
//	            	temp1.next = current;
//	            }
//	            current = null;
//	        }
//	        
//	        if(temp!=null) {
//		        temp1 = previous;
//	        	while(temp1.next != null)
//	        		temp1 = temp1.next;
//	        	temp1.next = temp;
//	        }
//	        return previous;
//	    }
//	    public static void main(String[] args)
//	    {
//	    	ListNode head1 = new ListNode(1);
//	 		head1.next = new ListNode(2);
//	 		head1.next.next = new ListNode(3);
//	 		head1.next.next.next = new ListNode(4);
//	 		head1.next.next.next.next = new ListNode(5);
//	 		
//	 		reverseKGroup(head1, 2);
//	    }
//	}

// class Solution {
//	    public static int removeDuplicates(int[] nums) {
//	    	
//	    	
//	    	
//	    	
//	    	char [] h = "dsjfksdiuf".toCharArray();
//	    	
//	        int length = nums.length;
//	        int j = 0;
//	        int writePointer = 1;
//	        int cnt = 1;        
//	        for(int i = 1; i < length; i++)
//	        {
//	            if(nums[i] == nums[j])
//	            {
//	                cnt++;
//	                if(cnt <= 2) writePointer++;
//	            }
//	            else
//	            {
//	                nums[writePointer] = nums[i];
//	                cnt = 1;
//	                j = writePointer;
//	                writePointer++;
//	            }
//	        }
//	        return writePointer;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	removeDuplicates(new int[] {1,1,1,2,2,3});
//	    }
//	}

// class Solution {
//	    public static int strStr(String s, String t) {
//	         int m = s.length(), n = t.length();
//	        // int tIndex = 0;
//	        // if (n == 0) return 0;
//	        // for (int i = 0, j; i <= m - n; i++) {
//	        //     // if (s.charAt(i + n - 1) != t.charAt(n - 1)) continue;
//	        //     // for (j = 0; j < n && s.charAt(i + j) == t.charAt(j); j++);
//	        //     // if (j == n) return i;
//	        //     tIndex = 0;
//	        //     if(s.charAt(i) == t.charAt(tIndex))
//	        //     {
//	        //         j = i + 1;
//	        //         tIndex++;
//	        //         while(tIndex < n && j < m && s.charAt(j) == t.charAt(tIndex))
//	        //             {tIndex++;j++;}
//	        //         if(tIndex == n)
//	        //             return i;
//	        //     }
//	        // }
//	        // return -1;
//	        
//	        //KMP
//	        
//	        
//	            int preSuf[] = new int[n];
//	            preSuf[0] = 0;           
//	            int[] lps = new int[t.length()];
//	            int i = 1;
//	            int prevLps = 0;
//	            
//	            while(i < t.length()){
//	                if(t.charAt(i) == t.charAt(prevLps)){
//	                    lps[i] = prevLps + 1;
//	                    i++;
//	                    prevLps++;
//	                } else if(prevLps != 0){
//	                    prevLps = lps[prevLps - 1];
//	                } else {
//	                    lps[i] = 0;
//	                    i++;
//	                }
//	            }
//	            i = 0;
//	            int j = 0;
//	        while(i < s.length()){
//	            if(s.charAt(i) == t.charAt(j)){
//	                i++;
//	                j++;
//	            } else {
//	                if(j != 0){
//	                    j = lps[j-1];
//	                } else {
//	                    i++;
//	                }
//	            }
//	            
//	            if(j == t.length()){
//	                return i - j;
//	            }
//	        }
//	        return -1;
//	    }
//	    
//	   public static void main(String[] args)
//	   {
//		   strStr("ababcabcababcabd", "abcabd");
//	   }
//	}

// class Solution {
//	    public static int compareVersion(String version1, String version2) {
//
////	    	 String[] v1Arr = version1.split("\\.");
////	         String[] v2Arr = version2.split("\\.");
////	       
////	         int v1Length = v1Arr.length;
////	         int v2Length = v2Arr.length;
////	         
////	         int i = 0, j = 0;
////	         for(i = 0, j = 0; i < v1Length && j < v2Length; i++,j++)
////	         	if(Integer.valueOf(v1Arr[i++]) !=Integer.valueOf(v2Arr[j++])) break; 
////	         
////	         if(i < v1Length && j < v2Length)
////	         {
////	             if(Integer.valueOf(v1Arr[i]) > Integer.valueOf(v2Arr[j])) return 1;
////	             else return -1;
////	         }
////	         else{
////	             if(i < v1Length){
////	                 while(i < v1Length && Integer.valueOf(v1Arr[i++]) == 0) i++;
////	                 if(i == v1Length) return 0;
////	                 else return 1;
////	             } 
////	             
////	             if(j < v2Length){
////	                 while(j < v1Length && Integer.valueOf(v2Arr[j++]) == 0) j++;
////	                 if(j == v2Length) return 0;
////	                 else return -1;
////	             } 
////	         }
////	         return 0;
//	    	int temp1 = 0,temp2 = 0;
//	    
//	        int len1 = version1.length(),len2 = version2.length();
//	        int i = 0,j = 0;
//	        while(i<len1 || j<len2) {
//	            temp1 = 0;
//	            temp2 = 0;
//	            while(i<len1 && version1.charAt(i) != '.') {
//	                temp1 = temp1*10 + version1.charAt(i++)-'0';
//	                
//	            }
//	            while(j<len2 && version2.charAt(j) != '.') {
//	                temp2 = temp2*10 + version2.charAt(j++)-'0';
//	                
//	            }
//	            if(temp1>temp2) return 1;
//	            else if(temp1<temp2) return -1;
//	            else {
//	                i++;
//	                j++;
//	                
//	            }
//	    }
//	        return 0;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	compareVersion("1.01", "1.0001");
//	    }
//	}

// class Solution {
////   int lcs(String text1, String text2, int n, int m) {
////      if (n == 0 || m == 0)
////          return 0;
//     
////      if (text1.charAt(n - 1) == text2.charAt(m - 1))
////          return 1 + lcs(text1, text2, n - 1, m - 1);
//     
////      return Math.max(lcs(text1, text2, n - 1, m), lcs(text1, text2, n, m - 1));
////  }
//	 static int matrix[][] = new int[1001][1001];
// static int longestSequence(String s1, String s2, int m, int n)
// {
//     if(m == 0 || n == 0) return 0;
//     
//     if(matrix[m][n] != -1) return matrix[m - 1][n - 1];
//     
//    
//     
//     if(s1.charAt(m - 1) == s2.charAt(n - 1)) 
//         return matrix[m - 1][n - 1] =  (1 + longestSequence(s1,s2, m - 1, n - 1));
//     return matrix[m - 1][n - 1] = Math.max(longestSequence(s1, s2,m, n - 1), longestSequence(s1, s2 ,m - 1, n));
// }
// 
// public static int longestCommonSubsequence(String text1, String text2) {
//     return longestSequence(text1, text2, text1.length(), text2.length());
// }
// 
// public static void main(String[] args)
// {
//	 longestCommonSubsequence("abcde", "ace");
// }
//}

// class Solution {
//	    public static int kthSmallest(int[][] matrix, int k) {
//	        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
//	        
//	        for(int i = 0; i < matrix.length; i++)
//	        {
//	            for(int j = 0; j < matrix[0].length; j++)
//	            {
//	                pq.offer(matrix[i][j]);
//	            }
//	        }
//	        
//	        int cnt = 1;
//	        int result = 1;
//	        while(!pq.isEmpty())
//	        {
//	            if(cnt == k) {
//	                result = pq.poll();
//	                break;
//	            }
//	            cnt++;
//	            pq.poll();
//	        }
//		    
//	        
//	        return result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	int mat[][] = new int[][] {{1,5,8}, {10,11,13}, {12,13,14}};
//	    	kthSmallest(mat, 8);
//	    }
//	}

// class Solution {
//
////   boolean isPalindrome(String str)
////   {
////       int start = 0;
////       int end = str.length() - 1;
//      
////       while(start < end)
////       {
////           if(str.charAt(start) != str.charAt(end)) return false;
////           start++;
////           end--;
////       }
////       return true;
////   }
//  
//  
//  
//  public static String longestPalindrome(String s) {
////           int length = s.length();
////       if(length == 0) return s;
////       int dp[][] = new int[length][length];
////       String result = "";
////        char[] array = s.toCharArray();
////       for(int i = 0; i < dp.length; i++)
////       {
////       	for(int k = 0, j = i; j < dp[0].length; j++,k++)
////       	{
//      		
////       		if(i == 0) dp[k][j] = 1;
////       		else if(i == 1) 
////       		{
////   	        	if(array[k] == array[j]) 
////   	        		dp[k][j] = 1;
////       		}
////   	        else
////   	        {
////   	        	if(array[k] == array[j] && dp[k + 1][j - 1] == 1)
////   	        		dp[k][j] = 1;    	        
////   	        }
////       		if(dp[k][j] == 1)
////       			result = s.substring(k,j+1); 
////       	}
////       }
////       return result;
//      
//      // int maxPalLength = 0;
//      // String longestPalidrome = "";
//      // int length = s.length();
//      // String temp = "";
//      // for(int i = 0; i < length; i++)
//      // {
//      //     temp = "";
//      //     for(int j = i; j < length; j++)
//      //     {
//      //         temp += s.charAt(j);   
//      //         if(isPalindrome(temp))
//      //         {
//      //             if((j - i + 1) > maxPalLength)
//      //             {
//      //                 maxPalLength = j - i + 1;
//      //                 longestPalidrome = temp;
//      //             }
//      //         }               
//      //     }        
//      // }
//      // return longestPalidrome;
//	  
//	  if (s.length() == 0) {
//          return "";
//      }
//		//Dp array for substring palindrome
//      boolean[][] dp = new boolean[s.length()][s.length()];
//      int start = 0, end = 0;
//
//	  
//	  for (int i = 0; i < s.length(); ++i) {
//          for (int j = i; j >= 0; --j) {
//              boolean startEqEnd = s.charAt(j) == s.charAt(i);
//
//              if (i == j) {
//                  //If the same char: 'a' is palindrome
//                  dp[i][j] = true;
//              } else if (i - j == 1) {
//                  //If length 2: 'ab' is palindrome when 'a' == 'b'
//                  dp[i][j] = startEqEnd;
//              } else if (startEqEnd && dp[i - 1][j + 1]) {
//                  
//                  dp[i][j] = true;
//              }
//
//              if (dp[i][j] && i - j > end - start ) {
//                  end = i;
//                  start = j;
//              }
//          }
//      }
//
//      return s.substring(start, end + 1);
//  }
//  public static void main(String[] args)
//  {
//	  longestPalindrome("aaaaa");
//	  
//  }
//}

// class Solution {
//	    static public int romanToInt(String S) {
//	       HashMap<Character, Integer> hashmap = new HashMap<>();
//	        hashmap.put('I',1);
//	        hashmap.put('V',5);
//	        hashmap.put('X',10);
//	        hashmap.put('L',50);
//	        hashmap.put('C',100);
//	        hashmap.put('D',500);
//	        hashmap.put('M',1000);
//	       
//	        
//	        int length = S.length();
//	        int result = 0;
//	        for(int i = 0; i < length - 1; i++)
//	        {
//	            if(hashmap.get(S.charAt(i)) < hashmap.get(S.charAt(i + 1))) result -= hashmap.get(S.charAt(i + 1));
//	            else result += hashmap.get(S.charAt(i));
//	        }
//	        
//	        return result += hashmap.get(S.charAt(length - 1));
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	romanToInt("MMXCIV");
//	    }
//	}

// class Solution {
//	    public static int myAtoi(String s) {
//	    	
//	    	List<Integer> hIntegers = Arrays.asList(1,2,3,4,5);
//	    	
//	    
//	        s = s.trim();
//	        
//	        boolean isNegative = false;
//	        int base = 1;
//	        int result = 0;
//	        int length = s.length();
//	        int i = 0;
//	        // char ch = s.charAt(0); 
//	        // if(!Character.isDigit(ch) && ch != '-' ) return 0;
//	        while(i < length)
//	        {
//	             if(s.charAt(i) == '-') {isNegative = true;i++;continue;}
//	            int number = s.charAt(i) - '0';            
//	            if(number >= 0 && number <= 9){
//	                result = result * 10 + number;            
//	            }
//	            if(result >= Integer.MAX_VALUE)
//	            {
//	                result = Integer.MAX_VALUE;
//	                break;
//	            }
//	              i++;
//	        }
//	        
//	      //  if(isNegative) result = -1*result;
//	        return (isNegative) ? result * -1 : result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	myAtoi("-91283472332");
//	    }
//	}
//
//        

// class Solution {
//	    public static int longestPalindromeSubseq(String s) {
//	        int length = s.length();
//	        int dp[][] = new int[length][length];
//	        
//	        StringBuilder sb = new StringBuilder(s);
//	        String reverse = sb.reverse().toString();
//	        List<Integer> arr1 = new ArrayList<>();
//	    
//	        
//	        for(int i = 1; i < length; i++)
//	        {
//	            for(int j = 1; j < length; j++)
//	            {
//	                if(s.charAt( i - 1) == reverse.charAt(j - 1))
//	                    dp[i][j] = 1 + dp[i - 1][j - 1];
//	                else 
//	                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
//	            }
//	        }
//	        return dp[length - 1][length - 1];
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	longestPalindromeSubseq("abbabasdkb");
//	    }
//	}
// class Solution {
//	    
//	    static boolean checkEquals(int[] a, int b[])
//	    {
//	        for(int i = 0;i < 26; i++)
//	        {
//	            if(a[i] != b[i]) return false;
//	        }
//	        return true;
//	    }
//	    
//	    public static boolean checkInclusion(String s1, String s2) {
//	        int count[] = new int[26];
//	        int slidingWindow = s1.length();
//	        int length = s2.length();
//	        for(int i = 0; i < slidingWindow; i++)
//	            count[s1.charAt(i) - 'a']++;
//	        
//	        int count2[] = new int[26];
//	        int i = 0;
//	        while(i < length && i < slidingWindow)
//	        {
//	            count2[s2.charAt(i) - 'a']++;
//	            i++;
//	        }
//	        
//	        if(checkEquals(count, count2))
//	            return true;
//	        
//	        while(i < length)
//	        {
//	            count2[s2.charAt(i - slidingWindow) - 'a']--;
//	            count2[s2.charAt(i) -  'a']--;
//	            if(checkEquals(count, count2)) return true;
//	            i++;
//	        }

//	        return false;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	checkInclusion("ab","eidbaooo");
//	    }
//
//	}

////////////// Recursion ////////////////

// Sort Array using recursion
// class Solution{
//	 static void sort(List<Integer> list)
//	    {
//	        if(list.size() == 1) return;
//	        
//	        int val = list.get(list.size() - 1);
//	        list.remove(list.size() - 1);
//	        sort(list);
//	        insert(list, val);
//	    }
//	    
//	    static void insert(List<Integer> list, int temp)
//	    {
//	    	//Base Condition
//	        if(list.size() == 0 || list.get(list.size() - 1) <= temp)
//	        {
//	            list.add(temp);
//	            return;
//	        }
//	        
//	        // Stored greater element which is greater tahn temp 
//	        // for insert after the temp
//	        int val = list.get(list.size() - 1);
//	        
//	        // smaller the input
//	        list.remove(list.size() - 1);
//	        
//	        // Again call for smaller element
//	        insert(list, temp);
//	        
//	        // now insert the element which is greater than temp
//	        // which was stored in val
//	        list.add(val);
//	    }
//	    public static int[] sortArray(int[] nums) {
//	    	List<Integer> list = new LinkedList<>();
//	        int length = nums.length;
//	        
//	        for(int i = 0; i < length; i++)
//	            list.add(nums[i]);
//	        
//	        sort(list);
//			return nums;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	sortArray(new int[] {3,4,5,1,1,3,4});
//	    }
// }

// Sort Stack
// class Solution{
//	 static void sort(Stack<Integer> stack)
//	    {
//	        if(stack.size() == 1) return;
//	        
//	        int val = stack.peek();
//	        stack.pop();
//	        sort(stack);
//	        insert(stack, val);
//	    }
//	    
//	    static void insert(Stack<Integer> stack, int temp)
//	    {
//	    	//Base Condition
//	        if(stack.size() == 0 || stack.peek() <= temp)
//	        {
//	            stack.push(temp);
//	            return;
//	        }
//	        
//	        // Stored greater element which is greater tahn temp 
//	        // for insert after the temp
//	        int val = stack.peek();
//	        
//	        // smaller the input
//	        stack.pop();
//	        
//	        // Again call for smaller element
//	        insert(stack, temp);
//	        
//	        // now insert the element which is greater than temp
//	        // which was stored in val
//	        stack.push(val);
//	    }
//	    public static Stack<Integer> sortArray(Stack<Integer> stack) {
//	        sort(stack);
//			return stack;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	Stack<Integer> stack = new Stack<>();
//	    	stack.push(2);
//	    	stack.push(4);
//	    	stack.push(5);
//	    	stack.push(1);
//	    	stack.push(0);
//	    	stack.push(2);
//	    	stack.push(3);
//	    	sortArray(stack);
//	    }
// }

// Delete Middle Element of stack
// class Solution{
//	
//	    public static Stack<Integer> deleteMiddle(Stack<Integer> stack, int middle) {
//	    	if(middle == 1) {
//	    		stack.pop();
//	    		return stack;
//	    	}
//	    	
//	    	int val = stack.peek();
//	    	
//	    	stack.pop();
//	    	deleteMiddle(stack, middle-1);
//	    	stack.push(val);
//			return stack;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	Stack<Integer> stack = new Stack<>();
//	    	stack.push(2);
//	    	stack.push(4);
//	    	stack.push(5);
//	    	stack.push(1);
//	    	stack.push(0);
//	    	stack.push(2);
//	    	stack.push(3);
//	    	deleteMiddle(stack,4);
//	    }
// }

// reverse stack
// class Solution{
//	 
//	 static void insert(Stack<Integer> stack, int element)
//	 {
//		 if(stack.size() == 0)
//		 {
//			 stack.push(element);
//			 return;
//		 }
//		 
//		 int val = stack.peek();
//		 stack.pop();
//		 insert(stack, element);
//		 stack.push(val);
//	 }
//	 
//		
//	    public static Stack<Integer> reverse(Stack<Integer> stack) {
//	    	if(stack.size() == 1) {
//	    		return stack;
//	    	}
//	    	
//	    	int val = stack.peek();
//	    	
//	    	stack.pop();
//	    	reverse(stack);
//	    	insert(stack, val);
//			return stack;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	Stack<Integer> stack = new Stack<>();
//	    	stack.push(2);
//	    	stack.push(4);
//	    	stack.push(5);
//	    	stack.push(1);
//	    	stack.push(0);
//	    	stack.push(2);
//	    	stack.push(3);
//	    	reverse(stack);
//	    	System.out.println(stack);
//	    }
//}

// Tower of hanoi
// class Solution
// {
//	 public static long towerOfHanoi(int N, int from, int to, int aux)
//	    {
//	        if(N == 0) return 0;
//	        
//	        long count = 1;
//	        
//	        count +=towerOfHanoi(N - 1, from, aux, to);
//	        System.out.println("move disk " + N +" from rod " + from + " to rod " + to);
//	        count +=towerOfHanoi(N - 1, aux, to, from);
//	        return count;
//	    }
//	    
//	    
//	    
//	    public static long toh(int N, int from, int to, int aux) {
//	        return towerOfHanoi(N, from, to, aux);
//	    }
//	    
//	    
//	    public static void main(String[] args)
//	    {
//	    	toh(3, 1, 3, 2);
//	    }
// }

// Generate Paranthesis
// class Solution
// { 
//	 static List<String> result = new LinkedList<>();
//	 public static void generateParanthesis(int open, int close, String output) 
//     {
//		 if(open == 0 && close == 0)
//		 {
//			 result.add(output);
//			 return;
//		 }
//		 if(open == close)
//			 generateParanthesis(open - 1, close, output + "(");
//		 else if(open == 0)
//			 generateParanthesis(open, close - 1, output + ")");
//		 else {
//			 generateParanthesis(open - 1, close, output + "(");
//			 generateParanthesis(open, close - 1, output + ")");
//		}
//		return; 
//     }
// 	 public static void main(String[] args)
// 	 {
// 		generateParanthesis(1,1,"");	
// 		System.out.print(result);
// 	 }
// }

// Efficient Solution of josephus
// class Solution{
//	 
//	 static int josephus(int n, int k)
//	    {
//	        if (n == 1)
//	            return 1;
//	        else
//	            /* The position returned by josephus(n - 1, k)
//	            is adjusted because the recursive call
//	            josephus(n - 1, k) considers the original
//	            position k%n + 1 as position 1 */
//	        	
//	        	// one person remove from circle so n - 1
//	        	//josephus(n - 1, k)
//	        	
//	        	//to get next position of person current + k - 1	        	
//	        	//+ k - 1)
//	        	// its circle so %n for avoid overflow
//				//% n 
//	        	
//	        	// to get next person position
//				//+ 1;
//	            return (josephus(n - 1, k) + k - 1) % n + 1;
//	    }
//	 
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int n = 5;
//        int k = 2;
//        System.out.println("The chosen place is "
//                           + josephus(n, k));
//	 }
// }
//class Solution{
// public List<String> generateParenthesis(int n) {
//     List<String> list = new ArrayList<String>();
//     backtrack(list, "", 0, 0, n);
//     return list;
// }
// 
// public static void backtrack(List<String> list, String str, int open, int close, int max){
//     
//     if(str.length() == max*2){
//         list.add(str);
//         return;
//     }
//     
//     if(open < max)
//         backtrack(list, str+"(", open+1, close, max);
//     if(close < open)
//         backtrack(list, str+")", open, close+1, max);
// }
//	 public static void main(String[] args)
//	 {
//		 List<String> result = new LinkedList<>();
//		 backtrack(result, "", 0, 0, 3);
//	 }
//}
//gfg Sort 2 sorted list
//class Solution
//{
//	
//	static void swap(int arr[], int index1, int index2)
//	{
//		int temp = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = temp;
//	}
//	
//	public static void main(String[] args)
//	{
//		int arr[] = new int[] {1,3,5,7};
//		int arr1[] = new int[] {0,2,4,6,8};
//		
//		int length = arr.length;
//		int length1 = arr1.length;
//		
//		boolean swapped = false;
//		for(int i = 0;  i < length; i++)
//		{
//			int j = 0;
//			while(j < length1 && arr1[j] < arr[i])
//			{
//				int temp = arr[i];
//				arr[i] = arr1[j];
//				arr1[j] = temp;
//				j++;
//			}
//		}
//		Arrays.sort(arr1);
//		
//		System.out.println(arr + " " + arr1);
//	}
//}

// class Solution {
//	    public static int maxProduct(int[] nums) {
//	        int length = nums.length;
//	        
////	         int product = 1;
////	         int max = Integer.MIN_VALUE;
////	         for(int i = 0; i < length; i++)
////	         {
//	            
////	             product *= nums[i];
////	             max = Math.max(max, product);
////	              if(product == 0) product = 1;
////	         }
////	         product = 1;
////	          for(int i = length - 1; i >=0; i--)
////	         {
//	            
////	             product *= nums[i];
////	             max = Math.max(max, product);
////	             if(product == 0) product = 1;
////	         }
////	         return max;
//	        int maxProduct = nums[0];
//	        int minProduct = nums[0];
//	        int ans = nums[0];
//	        for(int i = 1; i < length; i++)
//	        {
//	            if(nums[i] < 0)
//	            {
//	                int temp = maxProduct;
//	                maxProduct = minProduct;
//	                minProduct = temp;
//	            }
//	            
//	            maxProduct = Math.max(maxProduct * nums[i], nums[i]);
//	            minProduct = Math.min(minProduct * nums[i], nums[i]);
//	            ans = Math.max(ans, maxProduct);
//	        }
//	        
//	        return ans;
//	    }
//	    public static void main(String[] arg) {
//	    	maxProduct(new int[] {3,2,-1,5,-2});
//	    }
//	}
// class Solution {
//	    public static int lengthOfLongestSubstring(String s) {
//	        int length = s.length();
//	        int []index = new int[255];
//	        int leftpointer = 0;
//	        int rightPointer = 0;
//	        if(length == 0) return 0;
//	        int largest = 0;
//	        while(rightPointer < length)
//	        {
//	            char ch = s.charAt(rightPointer);
//	            if(index[ch] != 0)
//	            {
//	                leftpointer = index[ch] + 1;
//	                index[ch] = rightPointer;
//	            }
//	            else
//	            {
//	                index[ch] = rightPointer+1;  
//	                largest++;
//	            }
//	            rightPointer++;
//	            
//	        }
//	        return largest;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	lengthOfLongestSubstring("pwwkew");
//	    }
//	}

//contest - 297
// class Solution {
//	    public static double calculateTax(int[][] brackets, int income) {
//	        double tax = 0.0;
//	        double remaining = income;
//	        
//	        int i = 0;
//	        while(remaining > 0)
//	        {
//	            if(i == 0)
//	            {
//	                tax +=(double) (Math.min(brackets[i][0], income) * brackets[i][1]) / 100;
//	            }    
//	            else if(remaining >= brackets[i][0] - brackets[i - 1][0])
//	            {
//	                tax +=  ((double)(brackets[i][0] - brackets[i-1][0]) * brackets[i][1]) / 100;
//	            }
//	            else
//	                tax +=  ((double)(income - brackets[i-1][0]) * brackets[i][1]) / 100;
//	            remaining = income - brackets[i][0];
//	            i++;
//	        }
//	        
//	        return tax;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	int[][] arr = new int[][] {{3,50}, {7,10}, {12,25}};
//	    	calculateTax(arr, 10);
//	    }
//	}

// class Solution {
//	    public static int distributeCookies(int[] cookies, int k) {
//	        int sum = 0;
//	        int sum1  = 0;
//	        int length = cookies.length;
//	        int unfairness = Integer.MAX_VALUE;
//	        
//	        for(int i = 0;i <length; i++)
//	            sum+= cookies[i];
//	        
//	        int div = sum / k;
//	        
//	        for(int i = 0; i < length; i++)
//	        {
//	            sum1 = 0;
//	            while(i < length && sum1 <= div)
//	            {
//	                sum1+= cookies[i];
//	                i++;
//	            }
//	            unfairness = Math.min(sum1, unfairness);
//	            
//	        }
//	        
//	        return unfairness;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	distributeCookies(new int[] {8,15,10,20,8}, 2);
//	    }
//	   }

// Generate Unique Subset Using Backtracking 
// class Solution {
//	    public static List<List<Integer>> subsetsWithDup(int[] nums) {
//	        Arrays.sort(nums);
//	        Set<List<Integer>> set = new LinkedHashSet<List<Integer>>();
//	       // subset(0, nums, ans, new ArrayList<>());
//	        List<Integer> temp = new LinkedList<Integer>();
//	        backtrack(nums, set, temp, 0);
//	        List<List<Integer>> result = new ArrayList<List<Integer>>(set);
//	         return result;
//	    }
//	    
////	    private static void subset(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds) {
////	        ans.add(new ArrayList<>(ds));
////	        
////	        for (int i = index; i < nums.length; i++) {
////	            if (i > index && nums[i] == nums[i - 1]) {
////	                continue;
////	            }
////	            ds.add(nums[i]);
////	            subset(i + 1, nums, ans, ds);
////	            ds.remove(ds.size() - 1);
////	        }
////	    }
//	    static void backtrack(int [] nums, Set<List<Integer>> set, List<Integer> ar,int index)
//	    {
//	        set.add(new ArrayList<Integer>(ar));
//	        
//	      //  if(index < nums.length) return;
//	        
//	        for(int i = index; i < nums.length; i++)
//	        {
//	       //     if(i > index) continue;
//	            ar.add(nums[i]);
//	            backtrack(nums, set, ar, i + 1);
//	            ar.remove(ar.size() - 1);
//	        }
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	subsetsWithDup(new int[] {1,2,3});
//	    }
//	}

// SubSet sum Using Backtracking
// class Solution {
//	    public static List<List<Integer>> subsetsWithDup(int[] nums) {
//	        Arrays.sort(nums);
//	        List<List<Integer>> result = new LinkedList<>();
//	       // subset(0, nums, ans, new ArrayList<>());
//	        List<Integer> temp = new LinkedList<Integer>();
//	        backtrack(nums, result, temp, 0, 0);
//	       
//	        System.out.println(result);
//	         return result;
//	    }
//	    
//	    // Pick and Non pick
////	    private static void subset(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds) {
////	        ans.add(new ArrayList<>(ds));
////	        
////	        for (int i = index; i < nums.length; i++) {
////	            if (i > index && nums[i] == nums[i - 1]) {
////	                continue;
////	            }
////	            ds.add(nums[i]);
////	            subset(i + 1, nums, ans, ds);
////	            ds.remove(ds.size() - 1);
////	        }
////	    }
//	    
//	    
//	    static void backtrack(int [] nums, List<List<Integer>> set, List<Integer> ar,int index, int sum)
//	    {
//	        set.add(new ArrayList<Integer>(ar));
//	        System.out.println(sum);
//	        
//	      //  if(index < nums.length) return;
//	        
//	        for(int i = index; i < nums.length; i++)
//	        {
//	            if(i > index && nums[i] ==  nums[i - 1]) continue;
//	            ar.add(nums[i]);
//	            sum += nums[i];
//	            backtrack(nums, set, ar, i + 1,sum);
//	            sum -= ar.get(ar.size() - 1);
//	            ar.remove(ar.size() - 1);
//	        }
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	subsetsWithDup(new int[] {1,2,2,1});
//	    }
//	}

//Palindrome Partitioning
// class Solution {
//	    
//	    static boolean isPalindrome(String str, int start, int end)
//	    {
//	        while(start < end)
//	        {
//	            if(str.charAt(start++) != str.charAt(end--)) return false;
//	        }
//	        return true;
//	    }
//	    
//	    
//	    static void subSet(String input,List<List<String>> result, LinkedList<String> temp, int index)
//	    {
//	        if(index == input.length())
//	        {
//	            result.add(new LinkedList<String>(temp));
//	            return;
//	        }
//	        
//	        for(int i = index; i < input.length();i++)
//	        {
//	            if(isPalindrome(input, index, i))
//	            {
//	                temp.add(input.substring(index, i + 1));
//	                subSet(input, result, temp, i + 1);
//	                temp.remove(temp.size() - 1);
//	            }
//	        }
//	    }
//	    
//	    public static List<List<String>> partition(String s) {
//	        List<List<String>>  result = new LinkedList<>();
//	        subS+et(s,result, new LinkedList<String>(), 0);
//	        return result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	partition("aab");
//	   
//	    }
//	}

// class Solution {
//	    
//	 	static boolean checkValid(String[][] temp, int row, int col)
//	 	{
//	 		//Only check 3 direction upperdiagonal(left), left and lower diagonal(left)
//	 		// bcz right side the process is remaining so already non procedded area
//	 		int n = temp.length;
//
//	 		
//	 		int tempRow = row, tempCol = col;
//	 		
//	 		//upperdiagonal(left)
//	 		while(row >=0 && col>=0)
//	 		{
//	 			if(temp[row][col] == "Q")
//	 				return false;
//	 			row--;
//	 			col--;
//	 		}
//	 		
//	 		row = tempRow; 
//	 		col = tempCol;
//	 		
//	 		//left
//	 		while(col >=0)
//	 		{
//	 			if(temp[row][col] == "Q")
//	 				return false;	 	
//	 			col--;
//	 		}
//	 		
//	 		row = tempRow; 
//	 		col = tempCol;
//	 		
//	 		//lower diagonal(left)
//	 		while(row < n && col >=0)
//	 		{
//	 			if(temp[row][col] == "Q")
//	 				return false;
//	 			row++;
//	 			col--;
//	 		}
//	 		return true;
//	 	}
//	 
//	 
//	    static void startGame(String[][] temp, List<List<String>> result, int col,int n )
//	    {
//	    	// if col reaches to end then we got the solution
//	    	if(col == n)
//	    	{
//	    		String tempString = "";
//	    		List<String> tempList = new LinkedList<>();
//	    		for(int i = 0; i < n; i++)
//	    		{
//	    			tempString = "";
//	    			for(int j = 0; j < n; j++)	    		
//	    				tempString += temp[i][j];
//	    			
//	    			tempList.add(tempString);
//	    		}
//	    		
//	    		result.add(new LinkedList<>(tempList));
//	    		return;
//	    	}
//	    	
//	    	
//	    	for(int i = 0; i < n; i++)
//	    	{
//	    		if(checkValid(temp, i, col))
//	    		{
//	    			temp[i][col] = "Q";
//	    			
//	    			// try another solution
//	    			startGame(temp, result, col + 1, n);
//	    			
//	    			//backtrack
//	    			temp[i][col] = ".";
//	    		}
//	    	}
//	    		
//	    }
//	    
//	    
//	    public static List<List<String>> solveNQueens(int n) {
//	        List<List<String>> result = new LinkedList<>();
//	        
//	        String [][] chessBoard  = new String[n][n];
//	        
//	        for(int i = 0; i < n; i++)	        
//	            Arrays.fill(chessBoard[i], ".");
//	        
//	        startGame(chessBoard, result, 0, n);
//	       
//	        return result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	char[][] a = new char[2][3];
//	    	solveNQueens(4);
//	    }
//	}
// 
// class Solution {
//	    
////	 	static boolean checkValid(HashMap<Integer, Boolean> rowMap,int row,int col, int n, HashMap<Integer, Boolean> upperDiagonalMap,HashMap<Integer, Boolean> lowerDiagonalMap)
////	 	{
////	 		if(rowMap.get(row) == null) return false;
////	 		if(upperDiagonalMap.get((n - 1) + (col - row)) == null) return false;
////	 		if(lowerDiagonalMap.get(row+col) == null) return false;
////	 		return true;
////	 	}
//	 
//	 
//	    static void startGame(char[][] temp, List<List<String>> result, int col,int n,int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal)
//	    {
//	    	// if col reaches to end then we got the solution
//	    	if(col == n)
//	    	{
//	    		String tempString = "";
//	    		List<String> tempList = new LinkedList<>();
//	    		for(int i = 0; i < n; i++)
//	    		{
//	    			tempString = "";
//	    			for(int j = 0; j < n; j++)	    		
//	    				tempString += temp[i][j];
//	    			
//	    			tempList.add(tempString);
//	    		}
//	    		
//	    		result.add(new LinkedList<>(tempList));
//	    		return;
//	    	}
//	    	
//	    	
//	    	for(int i = 0; i < n; i++)
//	    	{
//	    		if(leftRow[i] == 0 && lowerDiagonal[i + col] == 0 && upperDiagonal[n - 1 + col - i] == 0){
//	    		{
//	    		  temp[i][col] = 'Q';
//    			  leftRow[i] = 1;
//                  lowerDiagonal[i + col] = 1;
//                  upperDiagonal[n - 1 + col - i] = 1;
//	    			
//	    			// try another solution
//    			startGame(temp, result, col + 1, n, leftRow, lowerDiagonal, upperDiagonal);
//    			
//    			//backtrack
//    			temp[i][col] = '.';
//    			leftRow[i] = 0;
//                lowerDiagonal[i + col] = 0;
//                upperDiagonal[n - 1 + col - i] = 0;
//	    		}
//	    		}
//	    	}
//	    }
//	    
//	    
//	    public static List<List<String>> solveNQueens(int n) {
//	        List<List<String>> result = new LinkedList<>();
//	        int[] leftRow = new int[n];
//	        int[] lowerDiagonal = new int[2 * n - 1];
//	        int[] upperDiagonal = new int[2 * n - 1];
//	        
//	        char [][] chessBoard  = new char[n][n];
//	        
//	        for(int i = 0; i < n; i++)	        
//	            Arrays.fill(chessBoard[i], '.');
//  
//	        startGame(chessBoard, result, 0, n, leftRow, lowerDiagonal, upperDiagonal);
//	       
//	        return result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {	    	
//	    	solveNQueens(4);
//	    }
//	}

// Kth Smallest 
// class Solution{
//	    public static int kthSmallest(int[] arr, int k) 
//	    { 
//	    	 PriorityQueue<Integer> pq = new PriorityQueue<>();
//		        int length = arr.length;
//		        for(int i = 0; i < k; i++)
//		            pq.offer(arr[i]);
//		        
//		        int i =k;
//		        k = k - 1;
//		        while(i < length & k > 0)
//		        {
//		            if(arr[i] > pq.peek())
//		            {
//		                pq.poll();
//		                pq.offer(arr[i]);
//		                k--;
//		            }
//		            else k--;
//		            i++;
//		        }
//		        
//		        if(k != 0)
//		        {
//		                while(k-- > 0) pq.poll();
//		        }return pq.peek();
//	    } 
//	    
//	    public static void main(String[] args)
//	    {
//	    	kthSmallest(new int[] {12,5,778,1,23}, 2);
//	    }
//	}

// Happy number
// class Solution 
// {
//     public static boolean isHappy(int n) 
//     {
//         HashMap<Integer,Integer> map= new HashMap<>();
//         int dusra_temp=n;
//         
//         while(n != 1)
//         {
//             int sum=0;
//             dusra_temp = n;
//             while(dusra_temp>0 )    
//             {
//                 
//                 int temp=dusra_temp%10;
//                 sum+=temp*temp;
//                 dusra_temp=dusra_temp/10;
//             } 
//             n=sum;
//             if(map.containsKey(n))
//             {
//                return false; 
//             }
//             else
//             {
//                 map.put(n,1);
//             }
//         }
//         
//         return true;
//     }
//     public static void main(String[] args)
//     {
//    	 System.out.println(isHappy(7));
//     }
// }

// Rat in maze
//class Solution
//{
//	static void solve(int di[],int []dj, List<String> result,boolean visited[][], int[][] maze, int row, int col, String path, int n)
//	{
//		
//		// Solution
//		if(col == n - 1 && row == n - 1)
//		{
//			result.add(path);
//			return;
//		}
//		
//		//downward
//		if(row + 1 < n && maze[row + 1][col] == 1 && visited[row + 1][col] == false)
//		{
//			visited[row][col] = true;
//			solve(result, visited, maze, row + 1, col, path + "D", n);
//			visited[row][col] = false;
//		}
//		
//		//left
//		if(col - 1 >= 0 && maze[row][col -1 ] == 1 && visited[row][col - 1] == false)
//		{
//			visited[row][col] = true;
//			solve(result, visited, maze, row, col - 1, path + "L", n);
//			visited[row][col] = false;
//		}
//		
//		//right
//		if(col + 1 < n && maze[row][col + 1] == 1&& visited[row][col + 1] == false)
//		{
//			visited[row][col] = true;
//			solve(result, visited, maze, row, col + 1, path + "R", n);
//			visited[row][col] = false;
//		}
//		
//		//upward
//		if(row - 1 >= 0 && maze[row - 1][col] == 1&& visited[row - 1][col] == false)
//		{
//			visited[row][col] = true;
//			solve(result, visited, maze, row - 1, col, path + "R", n);
//			visited[row][col] = false;
//		}
//		String direction = "DLRU";
//		
//		for(int i = 0; i < 4; i++)
//		{
//			int r = row + di[i];
//			int c = col + dj[i];
//			
//			if(r >=0 && r < n && c >=0 && c < n && visited[r][c] == false && maze[r][c] == 1)
//			{
//				visited[r][c] = true;
//				solve(di, dj, result, visited, maze, r, c, path + direction.charAt(i), n);
//				visited[r][c] = false;
//			}
//		}
//		
//

//		    String dir = "DLRU";
//		    for (int ind = 0; ind < 4; ind++) {
//		      int nexti = row + di[ind];
//		      int nextj = col + dj[ind];
//		      if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n &&
//		        visited[nexti][nextj] == false && maze[nexti][nextj] == 1) {
//
//		        visited[row][col] = true;
//		        solve( di, dj, result,visited, maze, nexti, nextj,  path + dir.charAt(ind),n);
//		        visited[row][col] = false;
//
//		      }
//		    }
//	}
//	
//	static void solveRatInMaze(int[][] maze, int n) {
//		List<String> result = new LinkedList<>();	
//		boolean visited[][] = new boolean[n][n];
//		int di[] = {1,0,0,-1};
//		int dj[] = {0,-1,1, 0};
//		solve(di,dj,result,visited, maze, 0, 0, "", n);
//		System.out.println(result);
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		int maze[][] = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
//		solveRatInMaze(maze,4);
//		
//	}
//}

// class Solution
// {
//	 public static boolean wordBreak(String s, List<String> wordDict) {        
//	        return bckTrck(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
//	    }
//	    
//	    public static boolean bckTrck(String s, Set<String> dict, int idx, Boolean[] memo) {
//  	        if (idx == s.length()) return true;
//	        
//	        if (memo[idx] != null) return memo[idx];
//	        
//	        for (int end = idx + 1; end <= s.length(); end++) {
//	            if (dict.contains(s.substring(idx, end)) && bckTrck(s, dict, end, memo)){
//	                memo[idx] = true;
//	                return true;
//	            } 
//	        }
//	        
//	        memo[idx] = false;
//	        return false;
//	    }
//	 
// class Solution {
//	    public static boolean wordBreak(String s, List<String> wordDict) {
//		// for memoization
//	        HashMap<String,Boolean> map= new HashMap<>();
//	        return canConstruct(s, wordDict, map);
//	    }
//	    
//	    public static boolean canConstruct(String target,List<String> words, HashMap<String,Boolean> map)
//	    {
//		
//		// if answer already cached, return it
//	        if(map.containsKey(target))
//	            return map.get(target);
//				
//			// if target string is empty
//			// it can always be constructed by taking no elements from dictionary
//	        if(target.isEmpty())
//	            return true;
//				
//			// for all words in the dictionary
//	        for(String word: words)
//	        {
//			// if the target starts with the given word
//	            if(target.startsWith(word))
//	            {
//				// and it is possible to construct the rest of the string
//				// from the words in the dictionary
//	                if(canConstruct(target.substring(word.length()),words, map))
//	                {
//					
//					// save and return true
//	                    map.put(target, true);
//	                    return true;
//	                }
//	            }
//	        }
//			
//			// if it was not possible to construct the target from words from the dictionary
//			// save and return false to the previous call
//	        map.put(target,false);
//	        return false;
//	    }
//	 public static void main(String[] args)
//	 {
//		 wordBreak("leetcod", Arrays.asList("leet","code"));
//	 }
// }
// 

/////////////////////////// Subsets/SubSequence/Combination /////////////////////////////////
//Subset : order is not maintain like [1,2,3,4] =  [3,1] can be called subset and [1,2] = [2,1]
//Subseauence : order is maintain like [1,2,3,4] =  [3,1] can't be called subset bcz of order

//Print All SubSets - String (using recursion pick and not pick method)
// Recusion

//class Solution
//{
//	 static void printAllSubsets(String input, String output)
//	 {
//		 if(input.length() == 0) {
//			 System.out.println(output);
//			 return;
//		 }
//		 
//		 String op1 = output;
//		 String op2 = output;
//		 
//		 op2 += input.charAt(0);
//		 input = input.substring(1, input.length());
//		 
//		 printAllSubsets(input, op1);
//		 printAllSubsets(input, op2);
//		 
//		 return;
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 printAllSubsets("abcaaca", "");
//	 }
//}

// Iterative Approach - String
// All one empty list into result and just iterate through the size of 
// result and add the String character and u got all the subsets
//example: initialize []
// FIRST ITERATION: [] , [1] - traverse till length of result(1)
// SECOND ITERAION: [], [1], [2](add 2 in the [] of result] , [1,2](add 2 in the result list [1]
// and so on...
// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		 String string = "abcd";
//		 
//		 List<List<String>> resultList = new LinkedList<>();
//		 resultList.add(new LinkedList<>());
//		 for(int i = 0; i < string.length(); i++)
//		 {
//			 List<List<String>> list = new LinkedList<>();
//			 for(List<String> l: resultList)
//			 {
//				 l = new LinkedList<String>(l);
//				 l.add(""+string.charAt(i));
//				 list.add(l);
//			 }
//			 resultList.addAll(list);
//		 }
//		 
//		 System.out.println(resultList);
//	 }
// }
// 

// Backtracking - String 

// class Solution {
//	    static void backtrack(String s, int index, List<List<String>> result, LinkedList<String> ar)
//	    {
//	        result.add(new LinkedList<String>(ar));
//	        
//	        for(int i = index; i < s.length(); i++)
//	        {
//	            ar.add(""+s.charAt(i));
//	            backtrack(s, i + 1, result, ar);
//	            ar.remove(ar.size() - 1);
//	        }
//	    }
//	    
//	    
//	    
//	    public static List<List<String>> subsets(String s) {
//	         List<List<String>> result = new ArrayList<List<String>>();
//	        
//	        backtrack(s, 0, result, new LinkedList<String>());
//	 
//	         return result;
//	    }
//	    
//	    public static void main(String[] args)
//	    {	
//	    	System.out.println(subsets("abcd"));
//	    }
//	}

//Recursive Solution - Integer

// class Solution
// {
//	    static void subsets(int[] nums, ArrayList<Integer> ar,int index)
//	    {
//	        if(nums.length == index)
//	        {
//	            System.out.println(ar);
//	            return;
//	        }
//	        
//	        subsets(nums, new ArrayList<>(ar) , index + 1);
//	        ar.add(nums[index]);
//	        subsets(nums, new ArrayList<>(ar), index + 1);
//	    }
// 	 public static void main(String[] args)
// 	 {
// 		 List<Integer> list = new LinkedList<>();
//
// 		subsets(new int[] {1,2,3}, new ArrayList<>(), 0);
// 	 }
// }

// Iterative - Integer

//class Solution
//{
//	public static void main(String[] args)
//	{
//		List<List<Integer>> result = new LinkedList<>();
//		result.add(new ArrayList<>());
//		
//		int nums[] = new int[] {1,2,3,4};
//		
//		for(int i =0;i < nums.length; i++)
//		{
//			List<List<Integer>> list = new LinkedList<List<Integer>>();
//			
//			for(List<Integer> l: result)
//			{
//				l = new LinkedList<>(l);
//				l.add(nums[i]);
//				list.add(l);
//			}
//			result.addAll(list);
//		}
//		
//		System.out.println(result);
//	}
//}

// Backtracking - Integer

// class Solution {
//	    void backtrack(int nums[], int index, List<List<Integer>> result, LinkedList<Integer> ar)
//	    {
//	        result.add(new LinkedList(ar));
//	        
//	        for(int i = index; i < nums.length; i++)
//	        {
//	            ar.add(nums[i]);
//	            backtrack(nums, i + 1, result, ar);
//	            ar.remove(ar.size() - 1);
//	        }
//	    }
//	    
//	    
//	    
//	    public List<List<Integer>> subsets(int[] nums) {
//	         List<List<Integer>> result = new ArrayList<List<Integer>>();
//	        
//	        backtrack(nums, 0, result, new LinkedList<Integer>());
//	 
//	         return result;
//	    }
//	}

////////////////////// Permutation //////////////////// 
//Generate All permutation - String
//class Solution
//{
//	 
//	 static String swap(String str, int index1, int index2)
//	 {
//		 char[] chArray = str.toCharArray();
//		 char ch = chArray[index1];
//		 chArray[index1] = chArray[index2];
//		 chArray[index2] = ch;
//		 return String.valueOf(chArray);
//	 }
//	 
//	  
//	 static void generatePermutation(String str, int left, int right)
//	 {		
//		 if(left == right)
//		 {
//			 System.out.println(str);
//			 return;
//		 }
//		 
//		 for(int i = left; i <= right; i++)
//		 {
//			 str = swap(str, left, i);
//			 generatePermutation(str, left + 1, right);
//			 str = swap(str, left, i);
//		 }
//	 }
//	 
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 generatePermutation("abc", 0, 2);
//	 }
//}

//Generate All permutation - Integer
// Swapping
//class Solution
//{
//	 
//	 static void swap(int []nums, int left, int right)
//	 {
//		 int temp = nums[left];
//		 nums[left] = nums[right];
//		 nums[right] = temp;
//	 }
//	 
//	  
//	 static void generatePermutation(int []nums, int left, int right, List<List<Integer>> result)
//	 {
//		 if(left == right)
//		 {
//			 int length = nums.length;
//			 List<Integer> list = new ArrayList<>();
//			 for(int i = 0; i < length; i++)			 
//				 list.add(nums[i]);
//			 
//			 result.add(list);
//			 return;
//		 }
//		 
//		 for(int i = left; i <= right; i++)
//		 {
//			 swap(nums, left, i);
//			 generatePermutation(nums, left + 1, right, result);
//			 swap(nums, left, i);
//		 }
//	 }
//	 
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int num[] = new int[] {1,2,3,4};
//		 List<List<Integer>> list = new ArrayList<>();
//		 generatePermutation(num, 0, num.length - 1, list);
//		 System.out.println(list);
//	 }
//}

// Backtracking

//class Solution
//{
//	static void permutation(int nums[], LinkedList<Integer> list)
//	{
//		if(list.size() == nums.length)
//		{
//			System.out.println(list);
//			return;
//		}
//		//System.out.println(list);
//		for(int i =0; i < nums.length; i++)
//		{
//			if(list.contains(nums[i])) continue;
//			list.add(nums[i]);
//			permutation(nums, list);
//			list.remove(list.size() - 1);
//		}
//	}
//	
//	
//	
//	
//	public static void main(String[] args)
//	{
//		permutation(new int[] {1,2,3,4}, new LinkedList<>());
//	}
//}

// Permutation String
// class Solution
// {
// 	 
// 	 static String swap(String s, int index1, int index2)
// 	 {
// 		 char [] chArray = s.toCharArray();
// 		 char temp = chArray[index1];
// 		chArray[index1] = chArray[index2];
// 		chArray[index2] = temp;
// 		
// 		return String.valueOf(chArray);
// 	 }
// 	 
// 	  
// 	 static void generatePermutation(String s, int left, int right, List<List<String>> result)
// 	 {
// 		 if(left == right)
// 		 {
// 			 int length = s.length();
// 			 List<String> list = new ArrayList<>();
// 			 for(int i = 0; i < length; i++)			 
// 				 list.add(""+s.charAt(i));
// 			 
// 			 result.add(list);
// 			 return;
// 		 }
// 		 
// 		 for(int i = left; i <= right; i++)
// 		 {
// 			 s = swap(s, left, i);
// 			 generatePermutation(s, left + 1, right, result);
// 			 s = swap(s, left, i);
// 		 }
// 	 }
// 	 
// 	 public static void main(String[] args)
// 	 {
// 		 String string = "anc";
// 		 List<List<String>> list = new ArrayList<>();
// 		 generatePermutation(string, 0, string.length() - 1, list);
// 		 System.out.println(list);
// 	 }
// }
// 

// Permutation String - Backtracking
// class Solution
// {
// 	static void permutation(String s, LinkedList<String> list)
// 	{
// 		if(list.size() == s.length())
// 		{
// 			System.out.println(list);
// 			return;
// 		}
// 		//System.out.println(list);
// 		for(int i =0; i < s.length(); i++)
// 		{
// 			if(list.contains(""+s.charAt(i))) continue;
// 			list.add(""+s.charAt(i));
// 			permutation(s, list);
// 			list.remove(list.size() - 1);
// 		}
// 	}
// 	
// 	public static void main(String[] args)
// 	{
// 		permutation("abc", new LinkedList<>());
// 	}
// }

// SubString - String

// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		String string = "abcd";
//		
//		for(int i = 0;i < string.length(); i++)
//		{
//			for(int j = i; j < string.length(); j++)
//			{
//				System.out.print(string.substring(i,j+1) + " ");
//			}
//			System.out.println();
//		}
//	 }
// }
// 

// Sub string Integer 

// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		int nums[] = new int[] {1,2,3,4};
//		
//		List<Integer> list = new LinkedList<>();
//		
//		for(int i = 0;i < nums.length; i++)
//		{
//			list = new LinkedList<>();
//			for(int j = i; j < nums.length; j++)
//			{
//				list.add(nums[j]);
//			}
//			System.out.println(list);
//		}
//	 }
// }

//Print Unique Subset
//class Solution
//{
//	static HashSet<String> strings = new HashSet<>();
//	 static void printAllSubsets(String input, String output)
//	 {
//		 if(input.length() == 0) {
//			 if(strings.add(output))
//				 System.out.println(output);
//			 return;
//		 }
//		 
//		 String op1 = output;
//		 String op2 = output;
//		 
//		 op2 += input.charAt(0);
//		 input = input.substring(1, input.length());
//		 
//		 printAllSubsets(input, op1);
//		 printAllSubsets(input, op2);
//		 
//		 return;
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 printAllSubsets("aac", "");	
//	 }
//}

// Print Only Unique Subset - Set
// class Solution {
//	    
////   void subsets(int[] nums, Set<List<Integer>> set, List<Integer> ar,int index)
////   {
////       if(nums.length == index)
////       {
//         
////           set.add(ar);
////           return;
////       }
//      
////       subsets(nums, set,new ArrayList<>(ar) , index + 1);
////	    ar.add(nums[index]);
////	    subsets(nums, set, new ArrayList<>(ar), index + 1);
////   }
//  
//  void backtrack(int [] nums, Set<List<Integer>> set, List<Integer> ar,int index)
//  {
//      set.add(new ArrayList<Integer>(ar));
//      
//    //  if(index < nums.length) return;
//      
//      for(int i = index; i < nums.length; i++)
//      {
//          // Needed if we will not use set to avoid duplicate
//         // if(i > index && nums[i] == nums[i - 1]) continue;
//
//          ar.add(nums[i]);
//          backtrack(nums, set, ar, i + 1);
//          ar.remove(ar.size() - 1);
//      }
//  }
//  
//  
//  public List<List<Integer>> subsetsWithDup(int[] nums) {
//       Arrays.sort(nums);
//         
//      List<Integer> temp = new LinkedList<Integer>();
//         Set<List<Integer>> set = new LinkedHashSet<List<Integer>>();
//      // subsets(nums,set,temp,0);
//      backtrack(nums, set, temp, 0);
//       List<List<Integer>> result = new ArrayList<List<Integer>>(set);
//       return result;
//      
//  }  
//}

// Print Only Unique Subset - Backtrack

// class Solution {
//	    
//  void backtrack(int [] nums, List<List<Integer>> set, List<Integer> ar,int index)
//  {
//      set.add(new ArrayList<Integer>(ar));
//
//      for(int i = index; i < nums.length; i++)
//      {
//          // Needed if we will not use set to avoid duplicate
//          if(i > index && nums[i] == nums[i - 1]) continue;
//
//          ar.add(nums[i]);
//          backtrack(nums, set, ar, i + 1);
//          ar.remove(ar.size() - 1);
//      }
//  }
//  
//  
//  public List<List<Integer>> subsetsWithDup(int[] nums) {
//       Arrays.sort(nums);
//       
//      List<Integer> temp = new LinkedList<Integer>();
//         List<List<Integer>> set = new LinkedList();
//      // subsets(nums,set,temp,0);
//      backtrack(nums, set, temp, 0);
//       
//       return set;
//      
//  }  
//}
//

// Generate Unique Permutation - backtrack

// class Solution {
//     void generatePermutation(List<List<Integer>> result, int nums[], int l, int r)
//    {
//        if(l == r)
//        {
//            List<Integer> temp = new LinkedList<>();
//            for(int  i = 0; i < nums.length; i++)
//                temp.add(nums[i]);
//            
//            if(!result.contains(temp)) 
//                result.add(temp);
//        }
//        
//         
//        for(int  i = l; i <=r; i++)
//        {
//            if(i > l && nums[i] == nums[i - 1]) continue;
//            swap(nums, i, l);
//            generatePermutation(result, nums, l + 1, r);
//            swap(nums, i, l);
//        }
//    }
//    
//    void swap(int []nums, int index, int index1){
//        int temp = nums[index];
//        nums[index] = nums[index1];
//        nums[index1]= temp;
//    }
//    
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new LinkedList<>();
//        generatePermutation(result, nums, 0, nums.length - 1);
//        return result;
//    }
//}

// Combination Sum I
// class Solution {
//	    static void generateCombination(int index, List<List<Integer>> result, int[] nums,int target, List<Integer> list)
//		 	{
//		 		if(index == nums.length)
//		 		{
//		 			if(target == 0)
//		 				result.add(new ArrayList<>(list));
//		 			return;
//		 		}
//		 		
//		 		if(nums[index] <= target)
//		 		{
//		 			list.add(nums[index]);
//		 			generateCombination(index, result, nums, target - nums[index], list);
//		 			list.remove(list.size() - 1);
//		 		}
//		 		generateCombination(index + 1, result, nums, target, list);
//		 	}
//	    
//	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//	        List<Integer> arr = new LinkedList<Integer>();
//	        List<List<Integer>> arr1 = new LinkedList<>();
//	        generateCombination(0, arr1,candidates, target, arr);
//	        System.out.println(arr1);
//	        return arr1;
//	    }
//	}
//Combination Sum II
// class Solution {
//     void generatePermutation(List<List<Integer>> result, int nums[], int l, int r)
//    {
//        if(l == r)
//        {
//            List<Integer> temp = new LinkedList<>();
//            for(int  i = 0; i < nums.length; i++)
//                temp.add(nums[i]);
//            
//            if(!result.contains(temp)) 
//                result.add(temp);
//        }
//        
//         
//        for(int  i = l; i <=r; i++)
//        {
//            if(i > l && nums[i] == nums[i - 1]) continue;
//            swap(nums, i, l);
//            generatePermutation(result, nums, l + 1, r);
//            swap(nums, i, l);
//        }
//    }
//    
//    void swap(int []nums, int index, int index1){
//        int temp = nums[index];
//        nums[index] = nums[index1];
//        nums[index1]= temp;
//    }
//    
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new LinkedList<>();
//        generatePermutation(result, nums, 0, nums.length - 1);
//        return result;
//    }
//}

//Print Letter Case Permutation
//class Solution
//{ 
//	 static void printAllSubsets(String input, String output)
//	 {
//		 if(input.length() == 0) { 			
//				 System.out.println(output);
//			 return;
//		 }
//		 
//		 String op1 = output;
//		 String op2 = output;
//		 
//		op1 += Character.toLowerCase(input.charAt(0));
//		 op2 += Character.toUpperCase(input.charAt(0));
//		 input = input.substring(1, input.length());
//		 
//		 printAllSubsets(input, op1);
//		 printAllSubsets(input, op2);
//		 
//		 return;
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 printAllSubsets("abc", "");	
//	 }
//}

// Letter Case Permutation
//class Solution
//{ 
//	 static void printAllSubsets(String input, String output)
//	 {
//		 if(input.length() == 0) { 			
//				 System.out.println(output);
//			 return;
//		 }
//		 
//		 String op1 = output;
//		 String op2 = output;
//		 
//		 if(Character.isDigit(input.charAt(0)))
//		 {
//			 op1 = output + input.charAt(0);
//			 input = input.substring(1, input.length());
//			 printAllSubsets(input, op1);
//		 }
//		 else
//		 {
//	 		 op1 += Character.toLowerCase(input.charAt(0));
//	 		 op2 += Character.toUpperCase(input.charAt(0));
//	 		 input = input.substring(1, input.length());
//	 		 printAllSubsets(input, op1);
//	 		 printAllSubsets(input, op2);
//		 }
//		
//		 
//		
//		 
//		 return;
//	 }
//	 
//	 public static void main(String[] args)
//	 {
//		 printAllSubsets("a1b1", "");	
//	 }
//}

// Subset sum
// class Solution{
//	    
////   static void printSubset(List<List<Integer>> subsets, List<Integer> list, LinkedList<Integer> temp, int index)
////	 {
////		 if(list.size() == index)
////		 {
////			 subsets.add(temp);
////			 return;
////		 }
//		 
////	     printSubset(subsets,list, new LinkedList<>(temp), index + 1, sum + list.get(index));
////		 temp.add(list.get(index));
////		 printSubset(subsets,list, new LinkedList<>(temp), index + 1, sum);
////	 }
//
////pick and non pick
//static void printSubset( ArrayList<Integer> result, List<Integer> list, LinkedList<Integer> temp, int index, int sum)
//	 {
//		 if(list.size() == index)
//		 {
//			 result.add(sum);
//			 return;
//		 }
//		 
//	     printSubset(result,list, new LinkedList<>(temp), index + 1, sum + list.get(index));
//		 temp.add(list.get(index));
//		 printSubset(result,list, new LinkedList<>(temp), index + 1, sum);
//	 }
//	 
// //Backtrack
// static void backtrack(ArrayList<Integer> nums, int index, ArrayList<Integer> result, int sum)
// {
//     result.add(sum);
//     
//     for(int i = index; i < nums.size(); i++)
//     {
//         sum += nums.get(i);
//         backtrack(nums, i + 1, result, sum);
//         sum -= nums.get(i);
//     }
// }
// 
// ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
//      LinkedList<Integer> temp = new LinkedList<>();
//      ArrayList<Integer> result = new ArrayList<>();
//		// printSubset(result,arr, temp,0, 0);
//		backtrack(arr, 0, result, 0);
//		 return result;
// }
//}

// class Solution {
//	    public static int findMin(int[] nums) {
//	        int start = 0;
//	        int end = nums.length - 1;
//	        int length = nums.length;
//	        
//	        while(start <= end)
//	        {
//	            int mid = start + (end - start) / 2;
//	            
//	            if(nums[mid] <= nums[(mid + length - 1) % length ] && nums[mid] <= nums[(mid + 1) % length])
//	                return nums[mid];
//	            
//	            if(nums[mid] > nums[end])
//	                start = mid + 1;
//	            else end = mid -1;
//	        }	       
//	        return 0;
//	    }
//	    
//	    public static void main(String[] args) {
//	    	System.out.println(findMin(new int[] {3,1}));
//	    }
//	}

// class Solution {
//	    public static int findPeakElement(int[] nums) {
//	         int length = nums.length;
//	        // int i = length;
//	        // while(i > 0 && nums[i] < nums[i - 1]) i--;
//	        // return i;
//	        
//	        
//	        int start = 0;
//	        int end = length - 1;
//	        if(length == 1) return 0;
//	        
//	        while(start <= end)
//	        {
//	            int mid = start + (end - start) / 2;
//	            
//	            if(mid == 0 && nums[mid] > nums[mid + 1]) return mid;
//	            else if(mid == length -1  && nums[mid] > nums[mid - 1]) return mid;
//	            else if(mid > 0 && mid < length - 1&& nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
//	            
//	            if(nums[mid] <= nums[mid + 1]) start = mid + 1;
//	            else end = mid - 1;
//	        }
//	        
//	        return -1;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	findPeakElement(new int[] {1,2});
//	    }
//	}

// class Solution {
//	    public static ListNode oddEvenList(ListNode head) {
//	        ListNode temp = head;
//	        ListNode temp1 = head.next;
//	        ListNode temp2 = head.next;
//	        
//	        
//	        while(temp.next != null && temp != null)
//	        {
//	            temp.next = temp1.next;
//	            temp = temp.next;
//	            temp1.next = temp.next;
//	            temp1 = temp1.next;
//	        }
//	        
//	        temp.next = temp2;
//	        return head;
//	    }
//	    
//	    public static void main(String [] args)
//	    {
//	    	ListNode headListNode = new ListNode(1);
//	    	headListNode.next = new ListNode(2);
//	    	headListNode.next.next = new ListNode(3);
//	    	headListNode.next.next.next = new ListNode(4);
//	    	headListNode.next.next.next.next = new ListNode(5);
//	    	
//	    	oddEvenList(headListNode);
//	    }
//	}

// class Solution {
//
//	    int val;
//	    Solution next;
//	    Solution head = null;
//	    public Solution(int val) {
//	        this.val = val;
//	        this.next = null;
//	    }
//	    
//	     public Solution() {
//	       
//	    }
//	    
//	    public int get(int index) {
//	        int cnt = 1;
//	        if(index == 1) return head.val;
//	        Solution temp = head;
//	        
//	        
//	        while(temp!=null && cnt != index)
//	        {
//	            cnt++;
//	            temp = temp.next;
//	        }
//	        return temp.val;
//	        
//	    }
//	    
//	    public void addAtHead(int val) {
//	    	Solution newNode = new Solution(val);
//	        
//	        if(head == null)
//	        {
//	            head = newNode;
//	            return;
//	        }
//	        
//	        newNode.next = head;
//	        head = newNode;
//	    }
//	    
//	    public void addAtTail(int val) {
//	    	Solution newNode = new Solution(val);
//	        
//	        if(head == null)
//	        {
//	            head = newNode;
//	            return;
//	        }
//	        
//	        Solution temp = head;
//	        
//	        while(temp.next != null)
//	            temp = temp.next;
//	        
//	        temp.next = newNode;
//	        
//	    }
//	    
//	    public void addAtIndex(int index, int val) {
//	    	Solution newNode = new Solution(val);
//	    	
//	    	if(index == 0)
//	    	{
//	    		newNode.next = head;
//	    		head = newNode;
//	    		return;
//	    	}
//	        int cnt = 1;
//	          
//	        Solution temp = head;
//	         while(temp != null && cnt != index)
//	         {
//	            temp = temp.next;
//	             cnt++;
//	         }
//	        
//	        newNode.next = temp.next;
//	        temp.next = newNode;
//	    }
//	    
//	    public void deleteAtIndex(int index) {
//	         
//	        if(index == 0) {head = head.next;return;};
//	        int cnt = 0;
//	        Solution temp = head;
//	        Solution preSolution =null;
//	         while(temp != null && cnt != index)
//	         {
//	        	 preSolution = temp;
//	            temp = temp.next;
//	             cnt++;
//	         }
//	        preSolution.next = temp.next;
//	        
//	    }
//	    
//	    public void display()
//	    {
//	    	Solution temp = head;
//		        while(temp != null)
//		        {
//		            System.out.println(temp.val);
//		            temp = temp.next;
//		        }
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	Solution obj = new Solution();
//	    	obj.addAtHead(1);
//	    	obj.addAtTail(3);	    	
//	    	obj.addAtIndex(1, 2);
//	    	//System.out.println(obj.get(1));
//	    	obj.display();
//	    	obj.deleteAtIndex(1);
//	    	//System.out.println(obj.get(1));
//	    	obj.display();
//	    	
//	  
//	    }
//	}
//Binary Search - first and last occurance
// class Solution
// {
//	 static int findFirst(int nums[], int start, int end, int target)
//	 {
//		 if(start <=  end)
//		 {		 int mid = start + (end - start) /2 ;
//		 
//		 if(mid == 0 || nums[mid] == target && nums[mid - 1] < target)
//			 return mid;
//		 
//		 if(nums[mid] >= target)
//			 return findFirst(nums, start, mid - 1, target);
//		 else 
//			 return findFirst(nums, mid + 1, end, target);
//		 }
//		 return -1;
//	 }
//	 
//	 static int lastFirst(int nums[], int start, int end, int target)
//	 {
//		 if(start <=  end)
//		 {		 int mid = start + (end - start) /2 ;
//		 
//		 if(mid == nums.length -1 || nums[mid] == target && nums[mid + 1] > target)
//			 return mid;
//		 
//		 if(nums[mid] <= target)
//			 return findFirst(nums, mid + 1, end, target);
//		 else 
//			 return findFirst(nums, start, mid - 1, target);
//		 }
//		 return -1;
//	 }
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 System.out.println(lastFirst(new int[] {1,2,3,3,3,4,5,6,7} , 0, 8, 2));
//	 }
// }

//Binary search - count the number of occurance
// class Solution
// {
//	 static int findFirst(int nums[], int start, int end, int target)
//	 {
//		 if(start <=  end)
//		 {		 int mid = start + (end - start) /2 ;
//		 
//		 if(mid == 0 || nums[mid] == target && nums[mid - 1] < target)
//			 return mid;
//		 
//		 if(nums[mid] >= target)
//			 return findFirst(nums, start, mid - 1, target);
//		 else 
//			 return findFirst(nums, mid + 1, end, target);
//		 }
//		 return -1;
//	 }
//	 
//	 static int lastFirst(int nums[], int start, int end, int target)
//	 {
//		 if(start <=  end)
//		 {		 int mid = start + (end - start) /2 ;
//		 
//		 if(mid == nums.length -1 || nums[mid] == target && nums[mid + 1] > target)
//			 return mid;
//		 
//		 if(nums[mid] <= target)
//			 return findFirst(nums, mid + 1, end, target);
//		 else 
//			 return findFirst(nums, start, mid - 1, target);
//		 }
//		 return -1;
//	 }
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int first = findFirst(new int[] {1,2,3,3,3,4,5,6,7} , 0, 8, 3);
//		 int last = lastFirst(new int[] {1,2,3,3,3,4,5,6,7} , 0, 8, 3);
//		 
//		 System.out.println(last - first + 1);
//	 }
// }

// Binary search - search in rotated array / number of time array is rorated / find pivot element in rorated array 
// class Solution {
//	    
//	    
////   int binarySearch(int []nums, int start, int end, int target)
////   {
////       if(start > end) return -1;
////       int mid = start + (end - start) / 2;
//      
////       if(nums[mid] == target)
////           return mid;
//      
////       if(target > nums[mid]) return binarySearch(nums, mid + 1, end, target);
////       else return binarySearch(nums, start, mid - 1, target);
////   }
//  
//  public int search(int[] nums, int target) {
//     
//      int length = nums.length;
//      int start = 0;
//      int end = length - 1;
//      int index = length;
//      
//      
//      
//      while(start <= end)
//      {
//          int mid = start + (end - start) / 2;
//          
//          if(nums[mid] == target) return mid;
//          
//          if(nums[start] <= nums[mid])
//          {
//              if(nums[start] <= target && nums[mid] >= target)
//                  end = mid - 1;
//              else 
//                  start = mid + 1;
//          }
//          else
//          {
//              if(nums[mid] <= target && target <= nums[end])
//                  start = mid + 1;
//              else end = mid - 1;
//          }
//      }
//      return -1;
////       while(start <= end)
////       {
////           int mid = start + (end - start) / 2;
//          
////           if(nums[mid] <= nums[(mid + 1) % length] && nums[mid] <= nums[(mid + length - 1) % length])
////           {
////               index = mid;
////               break;
////           }
//          
////           if(nums[mid] <= nums[start]) end = mid -1;
////           else start = mid + 1;
////       }
////       if(nums[start] < nums[end])
////       {
////           return binarySearch(nums, 0, end, target);
////       }
////       else
////       {
////           while(start <= end)
////               {
////                   int mid = start + (end - start) / 2;
//
////                   if(nums[mid] <= nums[(mid + length - 1) % length ] && nums[mid] <= nums[(mid + 1) % length])
////                   {index = mid;break;}
//
////                   if(nums[mid] > nums[end])
////                       start = mid + 1;
////                   else end = mid -1;
////               }
////           System.out.println(index);
////           int result = binarySearch(nums, 0, index - 1, target);
////           if(result == -1) return binarySearch(nums, index,length - 1, target);
////           return result;
////       }
//  }
//}

//Binary search - Search in nearly sorted array
// class Solution
// { 
//	 
//	 static int search(int nums[], int target, int start, int end)
//	 {
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start)/ 2;
//			 
//			 if(nums[mid] == target) return mid;
//			 
//			 if(mid>0 && nums[mid - 1] == target) return mid - 1;
//			 
//			 if(mid<nums.length && nums[mid + 1] == target) return mid + 1;
//			 
//			 if(nums[mid] > target) end = mid - 2;
//			 else start = mid + 2;
//		 }
//		 return -1;
//	 }
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int nums[] = new int[] {10,3,40,20,50,80,70};
//		 
//		 int start = 0;
//		 int end = nums.length - 1;

//		 
//		 System.out.println(search(nums, 70, 0, nums.length - 1));
//		
//	 }
// }

// floor of target / least greater element 

// class Solution
// {
//	 static int floor(int nums[], int start, int end, int target)
//	 {
//		 int ans = 0;
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start)/ 2;
//			 
//			 if(nums[mid] == target) return mid;
//			 else if(nums[mid] > target) {end = mid -1;}
//			 else {ans = mid;start = mid + 1;}
//			 
//		 }
//		 return ans;
//	 }
//	 
//	 
//	 static int ceil(int nums[], int start, int end, int target)
//	 {
//		 int ans = 0;
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start)/ 2;
//			 
//			 if(nums[mid] == target) return mid;
//			 else if(target > nums[mid]) {start = mid + 1;}
//			 else {ans = mid;end = mid - 1;}
//			 
//		 }
//		 return ans;
//	 }
//	 
//	 
//	 static int nextAlphabet(char chars[], int start, int end, char target)
//	 {
//		 int ans = 0;
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start)/ 2;
//			 
//			 if(chars[mid] <= target) start = mid + 1;
//			 else {
//				 ans = mid;
//				 end = mid - 1;
//			 }
//			 
//		 }
//		 return ans;
//	 }
//	 
//	 static int firstOne(int nums[], int start, int end)
//	 {
//		 int ans = 0;
//		 while(start <= end)
//		 {
//			 int mid = start + (end  - start) / 2;
//			 if(nums[mid] == 1) {ans = mid;end = mid - 1;}
//			 else start = mid + 1;
//		 }
//		 
//		 return ans;
//	 }
//	 
//	 static int minDiff(int nums[], int start, int end, int key)
//	 {
//		 int ans =  0;
//		 
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start) / 2;
//			 
//			 if(nums[mid] == key) return nums[mid];
//			 
//			 if(nums[mid] > key)  end = mid - 1;
//			 else start = mid + 1;
//		 }
//		 
//		 return (Math.abs(key - nums[start]) > Math.abs(key - nums[end])) ? nums[end] : nums[start];
//	 }
//	 
//	 //Bitonic Array - peak valo array where there is one index where left and right sides are less that taht element
//	 
//	 // find element in nitonic array
//	 // search in bitonic array: first find peak element index that left side all elements are sorted and right side is also sorted(decresing) array 
// 	 public static void main(String[] arg)
//	 {
//		 int nums[] = new int[] {10,23,345,560,576,670};
//		 int start = 0;
//		 int end = nums.length - 1;
//		 int target = 2;
//		 
//		 char[] c = {'a','b','e','n','o'};
//		// System.out.println(nextAlphabet(c, start, end, 'b'));
//		 
////		 System.out.println(firstOne(nums, start, end));
//		 System.out.println(minDiff(nums, start, end, 470));
//	 }
// }

// Binary Search -  Allocate Minimum Number Of Pages
// class Solution
// {
//	 static boolean isValid(int nums[], int numberOfStudent, int max)
//	 {
//		 int length = nums.length;
//		 int totalStudent = 1;
//		 int sum = 0;
//		 
//		 for(int i = 0; i < length; i++)
//		 {
//			 sum += nums[i];
//			 
//			 if(sum > max)
//			 {
//				 totalStudent++;
//				 sum = nums[i];
//			 }
//			 
//			 if(totalStudent > numberOfStudent)
//				 return false;
//		 }
//		 
//		 return true;
//	 }
//	 
//	 static int findMaxPage(int nums[], int numberOfStudent, int start, int end)
//	 {
//		 int ans = 0;
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start) / 2;
//			 
//			 if(isValid(nums, numberOfStudent, mid))
//			 {
//				 ans = mid;
//				 end = mid - 1;
//			 }else start = mid + 1;
//		 }
//		 
//		 return ans;
//	 }
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int nums[] = new int[] {10,20,30,40};
//		 
//		 int end = 0;
//		 int start = Integer.MIN_VALUE;
//		 int length = nums.length;
//		 
//		 for(int i = 0; i < length; i++)
//		 {
//			 end+=nums[i];
//			 start = Math.max(start, nums[i]);
//		 }
//		 
//		System.out.println(findMaxPage(nums, 2, start, end));
//		 
//	 }
// }

// Median of matrix
// class Solution
// {
//	 static int findSmaller(int mid, int [][] matrix, int totalRow, int totalColumn)
//	 {
//		 int total = 0;		
//		 for(int i = 0; i < totalRow; i++)
//		 {
//			 int start = 0;
//			 int end = totalColumn - 1;
//			 
//			 while(start <= end)
//			 {
//				 int middle = start + (end - start) / 2;
//				 
//				 if(matrix[i][middle] <= mid) {				
//					 start = middle + 1;
//				 }
//				 else end = middle - 1;
//				
//			 }
//			 total += start;
//		 }
//		 
//		 return total;
//	 }
//	 
//	 
//	 static int median(int[][] matrix, int m, int n)
//	 {
//		 int median = m * n / 2;
//		 int row = matrix.length;
//		 int col = matrix[0].length;
//		 int start = Integer.MAX_VALUE;
//		 int end = Integer.MIN_VALUE;
//		 for(int i =0; i < col; i++)
//		 {
//			 start = Math.min(start, matrix[i][0]);
//			 end = Math.max(end, matrix[i][col - 1]);
//		 }
//		 
//		 
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start) / 2;
//			 
//			 int totalNum = findSmaller(mid, matrix, m,n);
//			 
//			 if(totalNum > median) end = mid -1 ;
//			 else start = mid + 1;
//		 }
//		 	
//		 return start;
//		 
//	 }
//	 
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 int matrix[][] = {{1,3,5},{2,6,9}, {3,6,9}};
//		 
//		 System.out.println(median(matrix, 3, 3));
//	 }
// }

// class Solution {
//	    public static int singleNonDuplicate(int[] nums) {
////	         int xor = 0;
////	         int length = nums.length;
////	         for(int i = 0;i < length; i++)
////	             xor^=nums[i];
//	        
////	         return xor;
//	        
//	        int length = nums.length;
//	        
//	        int start = 0;
//	        int end = length - 1;
//	        
//	        while(start <= end)
//	        {
//	            int mid = start + (end - start) / 2;
//	            
//	            if(mid > 0 && mid < length && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return mid;
//	            
//	            if(mid < length && nums[mid] != nums[mid + 1] && (end - mid) % 2 == 0 || !(mid > 0 && nums[mid] != nums[mid - 1] && (mid - start) % 2 == 0)) end = mid - 1;
//	            else start = mid + 1;
//	        }
//	        
//	        return -1;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8});
//	    }
//	}

// find median of 2 sorted array
// class Solution {
//	    public static double findMedianSortedArrays(int[] num1, int[] num2) {
////	        int length = nums1.length;
////	        int length1 = nums2.length;
////	        int newSortedArray[] = new int[length + length1];
////	        int k = 0;
////	        int i = 0, j = 0;
////	        while(i < length && j < length1)
////	        {
////	            if(nums1[i] < nums2[j]) newSortedArray[k++] = nums1[i++];
////	            else newSortedArray[k++] = nums2[j++];
////	        }
////	        
////	        while(i < length) newSortedArray[k++] = nums1[i++];
////	        while(j < length1) newSortedArray[k++] = nums2[j++];
////	        
////	       double ans = 0.0;
////	       int newSlength = newSortedArray.length;
////	       if(newSlength % 2 == 0)
////	       {
////	    	   int middle = newSlength /2;
////	    	   ans =(float) (newSortedArray[middle] + newSortedArray[middle - 1]) /2;
////	       }
////	       else {
////	    	   ans = (float)newSortedArray[newSlength /2];
////	       }
////	       return ans; 
//	    	 int length = num1.length;
//	          int length1 = num2.length;
//	          
//	          int start = 0;
//	          int end = length;
//	          
//	          int median = (length + length1 + 1) /2; 
//	          while(start <= end)
//	          {
//	              int cut1 = (start) + (end - start)/2;
//	              int cut2 = median  - cut1;
//	              
//	              int left1 = (cut1 == 0) ? Integer.MIN_VALUE : num1[cut1 - 1];
//	              int left2 = (cut2 == 0) ? Integer.MIN_VALUE : num2[cut2 - 1];
//	              
//	              int right1 = (cut1 == length) ? Integer.MAX_VALUE: num1[cut1];
//	              int right2 = (cut2 == length1) ? Integer.MAX_VALUE: num2[cut2];
//	              
//	              if(left1 <= right2 && left2 <=right1)
//	              {
//	                  if(median % 2 == 0)
//	                  {
//	                      return (float) (Math.min(right1, right2) + Math.max(left1,left2)) / 2.0;
//	                  }
//	                  else 
//	                  {
//	                      return (float)Math.max(left1, left2);
//	                  }
//	              }
//	              else if(left1 > right2) end = cut1 - 1;
//	              else start = cut1 + 1;
//	          }
//	          return -1;
//	       
//	    }
//	    
//	    public static void main(String [] args)
//	    {
//	    	findMedianSortedArrays(new int[] {1,2}, new int[] {3,4});
//	    }
//	}

//Binary Search - Find Closest Elements
// class Solution {
//	    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->{ 
//	        	if(Math.abs(a - x) == Math.abs(b - x))
//	        		return Integer.compare(a, b);
//	        	else
//	        		return Integer.compare(Math.abs(a-x), Math.abs(b-x));
//	        	});
//	        int length = arr.length;
//	        for(int i = 0; i < length; i++)
//	        	pq.add(arr[i]);
//	        
//	        List<Integer> result = new LinkedList<>();
//	        while(k-- > 0)
//	        	result.add(pq.poll());
//	        
//	        Collections.sort(result);
//	        
//	        System.out.println(result);
//	        
//	        return null;
//	    }
//	 public static void main(String[] args)
//	 {
//		 findClosestElements(new int[] {-3,-2,-1,0,1,2,3,4,5}, 4, 2); 
//	 }
// }

// class Solution
// { 
//	 public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//     int ans = 0;
//     int start = 0;
//     int end = arr.length - 1;
//     int length = arr.length;
//     List<Integer> result = new LinkedList<>(); 
//     while(start <= end)
//     {
//         int mid = start + (end - start) / 2;
//         if(arr[mid] > x)
//             end = mid - 1;
//         else{ans = mid; start = mid + 1;
//         }
//     }
//     
//     // create window ans - k to  ans + k
//     int l = (ans - k < 0) ? 0: ans - k;
//     int r = (ans + k >= length)?  length - 1: ans + k;
//     
//     while(r - l + 1 != k)
//     {
//    	 if(Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) l++;
//    	 else r--;
//     }
//     
//     for(int i = l; i <=r;i++)
//    	 result.add(arr[i]);
//     
//     return result;
//     
// }
//	 public static void main(String[] args)
//	 {
//		 findClosestElements(new int[] {1,2,3,4,5},4,3);
//	 }
// }

//contest
// class Solution {
//	    public static String greatestLetter(String s) {
//	        int lower[] = new int[26];
//	        int upper[] = new int[26];
//	        int length = s.length();
//	        
//	        for(int i =0; i < length; i++)
//	        {
//	            char ch = s.charAt(i);
//	            if(Character.isLowerCase(ch))
//	                lower[ch - 'a']++;
//	            else upper[ch - 'A']++;
//	                
//	        }
//	        
//	        
//	        for(int i = 25; i>=0 ; i--)
//	        {
//	            if(upper[i] > 0 && lower[i] > 0) return "" + (char)('A' + i) ;
//	        }
//	        return "";
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	greatestLetter("lEeTcOdE");
//	    }
//	}

// class Solution {
//	    public static int minimumNumbers(int num, int k) {
//	        int cnt = 0;
//	        int num1 = 0;
//	        int num2 = 0;
//	        if(num == 0) return 0;
//	        for(int i = -1; i < 10; i++)
//	        {
//	        	if(i == -1) num1 = 0;
//	        	else num1 = i * 10 + k;
//	        	for(int j = i; j < 10; j++)
//	        	{
//	        		if(j == -1) num2 = 0;
//	        		else num2 = j * 10 + k;
//	        		int sum = num1 + num2;
//	        		if(sum == num && num1 != num2) {cnt++;break;}
//	        		else if(sum > num) break;
//	        	}
//	        }
//	      
//	        return (cnt == 0)? -1: cnt;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	System.out.print(minimumNumbers(58, 9));
//	    }
//	}

// class Solution{
//	 
//	 static void generateSeq(String s, int k, int length, String temp, List<String> answer)
//	 {
//		// System.out.print(new LinkedList<>(temp));
//		 
//		 if(s.length() == 0)
//		 {
//			 System.out.println(temp );
//			 if(temp.length() > 0)
//			 {
//			 if(Integer.parseInt(temp, 2) <= k &&  answer.get(0).length() < temp.length())
//				answer.add(0,temp);
//			 } 
//			 return;
//		 }
//		 
//		 generateSeq(s.substring(1),k,length, temp + s.charAt(0), answer);
//		 generateSeq(s.substring(1),k, length, temp, answer);
//		 
//		 
////		 for(int i = index; i < length; i++)
////		 {
////			 temp.add(""+s.charAt(i));
////			 generateSeq(s,i+1, length, temp);
////			 temp.remove(temp.size() - 1);
////		 }
//		 
//		// return "";
//		 
//	 }
//	 
//	 public static int longestSubsequence(String s, int k) {
//		 List<String> result = new LinkedList<>();
//		 result.add("");
//	        generateSeq(s,k, s.length(),"", result );
//	        System.out.print(result);
//	        return 0;
//	  }
//	 public static void main(String[] args)
//	 {
//		 longestSubsequence("00101001", 1);
//		 
//	 }
// }

// public class Solution {
//	    static int kthelement(int arr1[], int arr2[], int m, int n, int k) {
//	    if(m > n) {
//	        return kthelement(arr2, arr1, n, m, k); 
//	    }
//	        
//	    int low = Math.max(0,k-m), high = n;
//	        
//	    while(low <= high) {
//	        int cut1 = (low + high) >> 1; 
//	        int cut2 = k - cut1; 
//	        int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1]; 
//	        int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
//	        int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1]; 
//	        int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2]; 
//	            
//	        if(l1 <= r2 && l2 <= r1) {
//	            return Math.max(l1, l2);
//	        }
//	        else if (l1 > r2) {
//	            high = cut1 - 1;
//	        }
//	        else {
//	            low = cut1 + 1; 
//	        }
//	    }
//	    return -1;
//	    }
//	    public static void main(String args[]) {
//	    int array1[] = {1,10,10,25,40,54,79};
//	    int array2[] = {15,24,27,32,33,39,48,68,82,88,90};
//	    int m = array1.length;
//	    int n = array2.length;
//	    int k = 15;
//	    System.out.println("The element at the kth position in the final sorted array is "+ 
//	      kthelement(array1,array2,m,n,k));
//	    
//	    }
//	}

// class Solution
// {
//	 
////	 static int kthElement(int num1[], int num2[], int k)
////	 {
////		 int m = num1.length;
////		 int n = num2.length;
////		 
////		 if(m > n) return kthElement(num2, num1, k);
////		 
////		 
////		 int start = Math.max(0, k - m);
////		 int end = Math.min(k, n) ;
////		 
////		 while(start <= end)
////		 {
////			 int cut1 = start + (end - start) / 2;
////			 int cut2 = k - cut1;
////			 
////			 int left1 = (cut1 == 0) ? Integer.MIN_VALUE: num1[cut1 - 1];
////			 int left2 = (cut2 == 0) ? Integer.MIN_VALUE: num2[cut2 - 1];
////			 
////			 int right1 = (cut1 == m) ? Integer.MAX_VALUE: num1[cut1];
////			 int right2 = (cut2 == n) ? Integer.MAX_VALUE: num2[cut2];
////			 
////			 if(left1 <= right2 && left2 <= right1)
////				 return Math.max(left1, left2);
////			 else if(left1 > right2)
////				 end = cut1 - 1;
////			 else start = cut1 + 1;
////		 }
////		
////		 return 0;
////		 
////	 }
//	 }	 
//	 public static void main(String[] args) {
//		 System.out.println(kthElement(new int[] {1,10,10,25,40,54,79}, new int[] {15,24,27,32,33,39,48,68,82,88,90},7,11, 15));
//	 }
// }

// Reverse K size Group Linked list

//   Definition for singly-linked list.
  class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
  
// class Solution {
//     public static ListNode reverseList(ListNode head) 
//      {
//         if(head==null)    
//         {
//             return head;
//         }
//         ListNode prev=null;
//         ListNode temp;
//         
//         while(head!=null)
//         {
//             temp=head.next;
//             head.next=prev;
//             
//             prev=head;
//             head=temp;
//         }
//         return prev;
//      }
//      public static ListNode reverseKGroup(ListNode head, int k) {    
//          ListNode dummy = new ListNode(0);
//          ListNode current = dummy;
//          
//          ListNode temp = head;
//          int cnt = 0;
//          ListNode next = null;
//          while(temp != null)
//          {
//              cnt++;
//              if(cnt % k == 0)
//              {
//                  next = temp.next;
//                  temp.next = null;
//                  ListNode reverseNode = reverseList(head);
//                  current.next = reverseNode;
//                  current = dummy;
//                  while(current.next != null) current = current.next;
//                  head = next;
//                  temp = next;
//              } else temp = temp.next;
//             
//          }     
//          
//        current.next = head;
//          return dummy.next;
//     }
//      
//      public static void main(String[] args)
//      {
//    	  ListNode head = new ListNode(1);
//    	  head.next = new ListNode(2);
//    	  head.next.next = new ListNode(3);
//    	  head.next.next.next = new ListNode(4);
//    	  head.next.next.next.next = new ListNode(5);
//    	  reverseKGroup(head, 2);
//    	  
//    	  
//      }
// }

// Aggressive Cow 
// class Solution
// {
//	 public static boolean isValid(int mid, int[] arr, int totalCow)
//	 {
//		 int length = arr.length;
//		 int cow = 1;
//		 int cowPosition = arr[0];
//		 for(int i = 1; i < length; i++)
//		 {
//			 if(arr[i] - cowPosition >= mid)
//			 {
//				 cowPosition = arr[i];
//				 cow++;
//			 }
//			 
//			 if(cow == totalCow) return true;
//		 }
//		 return false;
//	 }
//	 
//	 static int aggressiveCow(int arr[], int cow)
//	 {
//		 Arrays.sort(arr);
//		 int ans = 0;
//		 int length = arr.length;
//		 
//		 int start = 1;
//		 int end = arr[length - 1] - arr[0];
//		 
//		 while(start <= end)
//		 {
//			 int mid = start + (end - start) / 2;
//			 
//			 if(isValid(mid, arr, cow))
//			 {
//				 ans = mid;
//				 start = mid + 1;
//			 }
//			 else end = mid - 1;
//		 }
//		 return ans;
//	 }
//	 
//	 
//	 public static void main(String[] args)
//	 {
//		 System.out.println(aggressiveCow(new int[] {1,3,4,5,5},2 )); 
//	 }
// }

// class Solution {
//	    public static char nextGreatestLetter(char[] letters, char target) {
//	        int length = letters.length;
//	        
//	        int start = 0;
//	        int end  = length - 1;
//	        
//	        while(start <= end)
//	        {
//	            int mid =(start + (end - start) / 2);
//	            
//	            if(target >= letters[mid]) start = (mid + 1);
//	            else end = (mid - 1);
//	        }
//	        return letters[start];
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	nextGreatestLetter(new char[] {'c','f','j'},'c');
//	    }
//	}

//Intersection of Two Arrays - HashMap
// class Solution {
//	    public static int[] intersection(int[] nums1, int[] nums2) {
//	        ArrayList<Integer> ans=new ArrayList<>();
//	        HashMap<Integer, Integer> map = new HashMap<>();
//	        for(int i=0; i<nums1.length; i++){
//	             map.put(nums1[i],1);
//	        }
//	        for(int i=0; i<nums2.length; i++){
//	            if(map.getOrDefault(nums2[i],0)==1){
//	                ans.add(nums2[i]);
//	                map.put(nums2[i],0);
//	            }
//	        }
//	        int[] result=new int[ans.size()];
//	        for(int i=0;i<ans.size();i++)
//	        {
//	            result[i]=ans.get(i);
//	        }
//	        return result;
//	    }
//	    public static void main(String[] args)
//	    {
//	    	intersection(new int[] {9,9,3,4,5,1}, new int[] {9,7,8,1});
//	    }
//	}

//Intersection of Two Arrays - Binary Search
// class Solution {
//	 
//	    static boolean binarySearch(int target, int nums[])
//	    {
//	    	int start = 0;
//	    	int end = nums.length - 1;
//	    	
//	    	while(start <= end)
//	    	{
//	    		int mid = start + (end - start) / 2;
//	    		if(nums[mid] == target) return true;
//	    		
//	    		if(nums[mid] > target) end = mid - 1;
//	    		else start = mid + 1;
//	    	}
//	    	
//	    	
//	    	return false;
//	    }
//	 
//	    public static int[] intersection(int[] nums1, int[] nums2) {
//	    	
//	    	Arrays.sort(nums1);
//	        ArrayList<Integer> ans=new ArrayList<>();
//	        int num2Length = nums2.length;
//	        
//	        for(int i = 0; i < num2Length; i++)
//	        {
//	        	if(binarySearch(nums2[i], nums1))
//	        		ans.add(nums2[i]);
//	        }
//	    
//	        int[] result=new int[ans.size()];
//	        
//	        
//	        for(int i=0;i<ans.size();i++)
//	        {
//	            result[i]=ans.get(i);
//	        }
//	        return result;
//	    }
//	    public static void main(String[] args)
//	    {
//	    	intersection(new int[] {9,9,3,4,5,1}, new int[] {9,7,8,1});
//	    }
//	}

// find duplicate - good intuiation
// class Solution {
//public static int findDuplicate(int[] nums) {
//	int start =1;
//	int end = nums.length-1;
//	while(start <= end)
//	{
//	    int mid = (start + end)/2;
//	    int count= 0;
//	    for(int j = 0;j<nums.length;j++)
//	    {
//	        if(nums[j] <= mid && nums[j]>= start)
//	        {
//	            count++;
//	        }
//	    }
//	    if(count > (mid-start+1))
//	    {
//	        end = mid-1;
//	    }
//	    else
//	    {
//	        start = mid+1;
//	    }
//	}
//	    return start;
//}
//
//	public static void main(String[] args)
//	{
//		findDuplicate(new int[] {1,2,3,4,5,6,7,7});
//	}
//}
// class Pair
// {
//     int num1;
//     int num2;
//     
//     Pair(int num1, int num2)
//     {
//         this.num1 = num1;
//         this.num2 = num2;
//     }
// }
// 
// public class Solution {
//	    public static int smallestDistancePair(int[] nums, int k) {
//	        Arrays.sort(nums);
//	        int length=  nums.length;
//	        int start = 0;
//	        int end = nums[length - 1] - nums[0];
//	        
//	        
//	        while(start <= end)
//	        {
//	        		int mid = start + (end - start) / 2;
//	        		
//	        		int right = 0;
//	        		int left = 0;
//	        		int cnt = 0;
//	        		
//	        		while(right < length)
//	        		{
//	        			if(nums[right] - nums[left] > mid)
//	        				left++;
//	        			else {
//							cnt += right - left;
//							right++;
//						}
//	        		}
//	        		
//	        		if(cnt >= k)
//	        			end = mid - 1;
//	        		else start = mid + 1;
//	        }
//	        	     
//	        return start;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	smallestDistancePair(new int[] {9,10,7,10,6,1,5,4,9,8},16);
//	    }
//	    
//	}

// Binary Search - Split array in m with minimize the largest
// class Solution {
//	    
//	 static boolean valid(int nums[], int partition, int largestsum)
//	    {
//	        int length = nums.length;
//	        int sum = 0;
//	        int totalPartition = 0;
//	        for(int i = 0;i < length; i++)
//	        {
//	            sum += nums[i];
//	            if(sum > largestsum)
//	            {
//	                totalPartition++;
//	                sum = nums[i];
//	            }
//	        }
//	        return totalPartition + 1<= partition;
//	    }
//	    
//	    
//	    
//	    public static int splitArray(int[] nums, int m) {
//	        int length = nums.length;
//	        int start = Integer.MIN_VALUE;
//	        int end = 0;
//	        for(int  i = 0; i < length; i++)
//	        {
//	            start = Math.max(nums[i], start);
//	            end += nums[i];
//	        }
//	        
//	        int ans = 0;
//	        while(start <= end)
//	        {
//	            int mid = start + (end - start) / 2;
//	            
//	            if(valid(nums, m, mid))
//	            {ans = mid;end = mid - 1;} ;
//	            start = mid + 1;            
//	        }
//	        
//	        return ans;
//	    }
//	    
//	    
//	    public static void main(String[] args)
//	    {
//	    	System.out.println(splitArray(new int[] {1,2,3,4,5},2));
//	    }
//	}

////////////////////Priority Queue/////////////////////

// Priority Queue - nearly sort the sorted array
// class Solution
// { 
//     static void isKSortedArray(int arr[], int n, int k) 
//     { 
//        int current = 0;
//        int length = arr.length;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        int sortedArr[] = new int[length];
//        int j = 0;
//        
//        for(int i = 0; i < length; i++)
//        {
//            pq.offer(arr[i]);
//            if(pq.size() > k) 
//                sortedArr[j++] = pq.poll();
//        }
//         while(!pq.isEmpty())  sortedArr[j++] = pq.poll();
//     }
// }

// find Closest - PriorityQueue
// class Solution {
//	    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//	          PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->{ 
//		        	if(Math.abs(a - x) == Math.abs(b - x))
//		        		return Integer.compare(a, b);
//		        	else
//		        		return Integer.compare(Math.abs(a-x), Math.abs(b-x));
//		        	});
//		        int length = arr.length;
//		        for(int i = 0; i < length; i++)
//		        	pq.add(arr[i]);
//		        
//		        List<Integer> result = new LinkedList<>();
//		        while(k-- > 0)
//		        	result.add(pq.poll());
//		    
//	        Collections.sort(result);
//		        return result;
//	    }
//	    
//	    
//	    public static void main(String[] args)
//	    {
//	    	findClosestElements(new int[] {-1,-2,-3,1,2,3,4,5}, 4, 0);
//	    }
//	}

// Priority Queue - Top k frequent Element
// class Solution {
//	    public int[] topKFrequent(int[] nums, int k) {
//	        HashMap<Integer, Integer> hashmap = new  HashMap<>();
//	        int length = nums.length;
//	        int result[] = new int[k];
//	        int j = 0;
//	        for(int i = 0; i < length; i++)             
//	            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1);
//	    
//	        PriorityQueue<Integer> pq = new PriorityQueue<>( 
//	        (a,b) -> hashmap.get(b) - hashmap.get(a)
//	        ); 
//	        
//	        for(Map.Entry<Integer, Integer> map: hashmap.entrySet())
//	            pq.offer(map.getKey());
//	        
//	        while(k >0)
//	        {
//	            result[j] = pq.poll();
//	            j++;
//	            k--;
//	        }
//	        
//	        return result;
//
//	    }
//	}

// Sort Array by Increasing Frequency
// class Solution {
//	    public int[] frequencySort(int[] nums) {
//	         HashMap<Integer, Integer> hashmap = new HashMap<>();
//		        
//		        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
//	                if(hashmap.get(a) == hashmap.get(b))
//	                    return Integer.compare(b,a);
//	                else return hashmap.get(a) - hashmap.get(b);
//	            });
//		        
//		        int length = nums.length;
//		        
//		        for(int i = 0; i < length; i++)        
//		            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1);
//		        
//		        for(Integer key: hashmap.keySet())
//		            pq.offer(key);
//		        int i = 0;	     
//		        while(!pq.isEmpty()){ 
//	                int cnt = 0;
//	                int ele = pq.poll();
//	                int fre = hashmap.get(ele);
//	                while(cnt++ < fre) nums[i++] =ele; 
//	            };
//		        return nums;
//	    }
//	}

//class Pair
//{
//	int val1;
//	int val2;
//	
//	Pair(int n1, int n2)
//	{
//		val1 = n1;
//		val2 = n2;
//	}
//}
//
//// k Closest
//class Solution {
//    public static int[][] kClosest(int[][] points, int k) {
//       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (int)((b.val1 * b.val1) + (b.val2 * b.val2)) - ((a.val1 * a.val1) +          (a.val2 * a.val2)));
//       int result[][] = new int[k][2];
//       int length = points.length; 
//        int min = Math.min(k,length);
//       for(int i = 0; i < min; i++)
//    	   pq.offer(new Pair(points[i][0], points[i][1]));
//       
//        for(int i = min; i < length; i++)
//        {
//             pq.offer(new Pair(points[i][0], points[i][1]));
//            pq.poll();
//        }
//        
//        int j = 0;
//        while(!pq.isEmpty())
//        {
//            Pair p = pq.poll();
//            result[j][0] = p.val1;
//            result[j++][1] = p.val2;
//        }
//        
//       return result;
//       
//    }
//}

// min cost rods
// class Solution
// {
//     //Function to return the minimum cost of connecting the ropes.
//     static long minCost(long arr[], int n) 
//     {
//         PriorityQueue<Long> pq = new PriorityQueue<>();
//         int length = arr.length;
//         
//         
//         for(int i = 0; i < length; i++)
//             pq.offer(arr[i]);
//     
//         long sum = 0;
//         long finalAnswer = 0;
//         while(pq.size() > 1)
//         {
//             sum = pq.poll() + pq.poll();
//             finalAnswer += sum; 
//             if(pq.isEmpty()) break;
//             pq.offer(sum);
//         }
//         return finalAnswer;
//     }
//     
//     public static void main(String[] args)
//     {
//    	 minCost(new long[] {4,3,2,6}, 4);
//     }
// }

// class Solution {
//  public static int[] maxSlidingWindow(int[] nums, int k) {
////      int length = nums.length;
////      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
////      int result[] = new int[length - k + 1];
////
////      for(int i = 0; i < k; i++)
////          pq.offer(nums[i]);
////      
////      int pos = 0;
////      for(int j = k; j < length; j++)
////      {
////          result[pos] = pq.peek();
////          pq.remove(nums[pos++]);
////          pq.offer(nums[j]);
////      }
////      result[pos] = pq.peek();
////      return result;
//	  
//	  
//	  // Array Deque
//	  
//	  
//	  Deque<Integer> deque = new LinkedList<>();
//	  
//	  int length = nums.length;
//	  int result[] = new int[length - k + 1];
//	  int current = 0;
//	  for(int i = 0; i < length; i++)
//	  {
//		  
//		  // remove outof bound index in 
//		  if(!deque.isEmpty() && (i - k) == deque.peek())
//			  deque.removeFirst();
//		  
//		  // remove all index elements that are less than current element
//		  // for maintain the bigger element at first
//		  // Because we dont need smaller element before bigger element
//		  // as we find largest in sliding window
//		  while(!deque.isEmpty() && nums[deque.getLast()] <= nums[i])
//			  deque.removeLast();
//		  
//		  // Add bigger element index
//		  deque.offer(i);
//		  
//		  // hit the sliding window
//		  if(i >= k - 1)
//			  result[current++] = nums[deque.peek()];
//	  }	  
//	  PriorityQueue<Long> pq = new PriorityQueue<>((a,b) -> (int) (a - b));
//	  return result;
//          
//  }
//  
//  public static void main(String[] args)
//  {
//	  maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3);
//  }
//}

// Design Median Class
// class Solution {
//
//	    PriorityQueue<Integer> pq;
//	    public Solution() {
//	        pq = new PriorityQueue<Integer>();
//	    }
//	    
//	    public void addNum(int num) {
//	        pq.add(num);
//	    }
//	    
//	    public double findMedian() {
//	        int median = (pq.size() + 1)/ 2; 
//	        if(median % 2 == 0)
//	        {
//	            while((median)-- > 1) pq.poll();
//	            
//                float ans = (pq.poll() + pq.poll()) /(float) 2;
//	            return ans;
//	        }
//	        else 
//	        {
//	             while(median-- > 1) pq.poll();
//	            
//	             return pq.poll();
//	        }
//	  }
//
// 	public static void main(String[] args)
// 	{
// 		Solution obj = new Solution();
// 		  obj.addNum(1);
// 		 obj.addNum(2);
// 		  double param_2 = obj.findMedian();
// 	}
//	//  Your MedianFinder object will be instantiated and called as such:
//}
// 
// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		 String s1 = "y#fo##f";
//		 String s2 =  "y#f#o##f";
//		 
//		 int s1length = s1.length();
//		 int s2length = s2.length();
//		 
//		 Stack<Character> s1stack = new Stack<>();
//		 Stack<Character> s2stack = new Stack<>();
//		 for(int i = 0; i < s1length; i++)
//		 {
//			 char ch = s1.charAt(i);
//			 if(!s1stack.empty() && ch == '#') s1stack.pop();
//			 else s1stack.add(ch);
//		 }
//		 
//		 for(int i = 0; i < s2length; i++)
//		 {
//			 char ch = s2.charAt(i);
//			 if(!s2stack.empty() && (ch == '#')) s2stack.pop();
//			 else if(ch != '#') s2stack.add(ch);
//		 }
//		 
//		
//		 
//		 System.out.println(s1stack.equals(s2stack));
//			 
//	 }
// }
// 

// Singly Linkedlist Implementation

// class Node
// {
//	 int data;
//	 Node next;
//	 
//	 Node(int val)
//	 {
//		 data = val;
//		 next = null;
//	 }
// }
// 
// class LinkedList
// {
//	 Node head;
//	 
//	 public LinkedList() {
//		head = null;
//	}
//	 
//	 void addAtLast(int val)
//	 {
//		 Node newNode = new Node(val);
//		 
//		 if(head == null)
//		 {
//			 head = newNode;
//			 return;
//		 }	 
//		 
//		 Node temp = head;
//		 
//		 while(temp.next !=  null) temp = temp.next;
//		 
//		 temp.next = newNode;
//			 
//	 }
//	 
//	 void addBeforePosition(int val, int pos)
//	 {
//		 int cnt = 1;
//		 Node previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 Node newNode = new Node(val);
//		 if(pos == 1) {
//			 newNode.next = head;
//			 head = newNode;
//			 return;
//		 }
//		 
//		 temp = head;
//		 while(temp.next != null && cnt < pos)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		 previous.next = newNode;
//		 newNode.next = temp;
//	 }
//	 
//	 void addAfterPosition(int val, int pos)
//	 {
//		 int cnt = 1;
//		 Node previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 Node newNode = new Node(val);
//		 
//		 temp = head;
//		 while(temp != null && cnt < pos)
//		 {
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		 newNode.next = temp.next;
//		 temp.next = newNode;
//	 }
//	 	 
//	 void addAtFirst(int val)
//	 {
//		 Node newNode = new Node(val);
//		 if(head == null) {
//			 head = newNode;
//			 return;
//		 }
//		 
//		 newNode.next = head;
//		 head = newNode;
//	 }
//	 
//	 void removeFirst()
//	 {
//		 if(head == null) {
//			System.out.println("No Node in Linkelist");
//			 return;
//		 }
//		 
//		 head = head.next;
//	 }
//	 
//	 void removeLast()
//	 {
//		 if(head == null) {
//				System.out.println("No Node in Linkelist");
//				 return;
//		 }
//		 
//		 if(head.next == null) 
//		 {
//			 removeFirst();
//			 return;
//		 }
//		 
//		 Node temp = head, pre = null;
//		 
//		 while(temp.next != null) 
//		 { 
//			 pre = temp;
//			 temp = temp.next;
//		 }
//		 
//		 pre.next = null;
//	}
//	
//	 // or position
//	 void removeNode(int value)
//	 {	
//		 Node previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 temp = head;
//		 while(temp != null && temp.data != value)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//		 }
//		 
//		 if(temp == null) {
//			 System.out.println("No Element Found.");
//			 return;
//		 }
//		 
//		 previous.next = temp.next;
//	 }
//	 
//	 void display()
//	 {
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 System.out.println("Elements Of linkedlist...");
//		 
//		Node temp = head;
//		 while(temp != null)
//		 {
//			 System.out.println(temp.data + " ");
//			 temp = temp.next;
//		 }
//	 }
// }
//
// 
////Circular Linkedlist Implementation
// class CircularLinkedList
// {
//	 Node head;
//	 
//	 public CircularLinkedList() {
//		head = null;
//	}
//	 
//	 void addAtLast(int val)
//	 {
//		 Node newNode = new Node(val);
//		 
//		 if(head == null)
//		 {
//			 head = newNode;
//			 newNode.next = head;
//			 return;
//		 }	 
//		 
//		 Node temp = head.next;
//		 
//		 while(temp.next !=  head) temp = temp.next;
//		 
//		 temp.next = newNode;
//		 newNode.next = head;
//			 
//	 }
//	 
//	 void addBeforePosition(int val, int pos)
//	 {
//		 int cnt = 2;
//		 Node previous = head, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 Node newNode = new Node(val);
//		 if(pos == 1) {
//			 addAtFirst(val);
//			 return;
//		 }
//		 
//		 temp = head.next;
//		 while(temp.next != head && cnt < pos)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		 
//		 previous.next = newNode;
//		 newNode.next = temp;
//	 }
//	 
//	 void addAfterPosition(int val, int pos)
//	 {
//		 int cnt = 2;
//		 Node previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 Node newNode = new Node(val);
//		 
//		 if(pos == 1)
//		 {
//			 newNode.next = head.next;
//			 head.next = newNode;
//			 return;
//		 }
//		 temp = head.next;
//		 while(temp.next != head && cnt < pos)
//		 {
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		 
//		 newNode.next = temp.next;
//		 temp.next = newNode;
//	 }
//	 	 
//	 void addAtFirst(int val)
//	 {
//		 Node newNode = new Node(val);
//		 if(head == null) {
//			 head = newNode;
//			 newNode.next = head;
//			 return;
//		 }
//		 
//		 Node temp = head.next;
//		 
//		 while(temp.next !=  head) temp = temp.next;
//		 
//		 newNode.next = temp.next;
//		 temp.next = newNode;
//		 head = newNode;
//	 }
//	 
//	 void removeFirst()
//	 {
//		 if(head == null) {
//			System.out.println("No Node in Linkelist");
//			 return;
//		 }
//		 if(head.next == head) 
//		 {
//			 head = null;
//			 return;
//		 }
//		 Node temp = head.next; 
//		 while(temp.next != head) temp = temp.next;
//		 head = head.next;
//		 temp.next = head;
//	 }
//	 
//	 void removeLast()
//	 {
//		 if(head == null) {
//				System.out.println("No Node in Linkelist");
//				 return;
//		 }
//		 
//		 if(head.next == null) 
//		 {
//			 removeFirst();
//			 return;
//		 }
//		 
//		 Node temp = head.next, pre = null;
//		 
//		 while(temp.next != head) 
//		 { 
//			 pre = temp;
//			 temp = temp.next;
//		 }
//		 
//		 pre.next = head;
//	}
//	
//	 // or position
//	 void removeNode(int value)
//	 {	
//		 Node previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 if(head.data == value)
//		 {
//			 removeFirst();
//			 return;
//		 }
//		 
//		 temp = head.next;
//		 while(temp != head && temp.data != value)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//		 }
//		 
//		 if(temp == head) {
//			 System.out.println("No Element Found.");
//			 return;
//		 }
//		 
//		 previous.next = temp.next;
//	 }
//	 
//	 void display()
//	 {
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 System.out.println("Elements Of linkedlist...");
//		 
//		 System.out.println(head.data + " ");
//		Node temp = head.next;
//		 while(temp != head)
//		 {
//			 System.out.println(temp.data + " ");
//			 temp = temp.next;
//		 }
//		
//	 }
// } 
// 
////Doubly Linkedlist Implementation
// 
// class DoublyNode
// {
//	 int data;
//	 DoublyNode next;
//	 DoublyNode previous;
//	 
//	 public DoublyNode(int value) {
//		data = value;
//		next = null;
//		previous = null;
//	}
// }
// 
// 
// class DoublyLinkedList
// {
//	 DoublyNode head;
//	 
//	 public DoublyLinkedList() {
//		head = null;
//	}
//	 
//	 void addAtLast(int val)
//	 {
//		 DoublyNode newNode = new DoublyNode(val);
//		 
//		 if(head == null)
//		 {
//			 head = newNode;
//			 return;
//		 }	 
//		 
//		 DoublyNode temp = head;
//		 
//		 while(temp.next !=  null) temp = temp.next;
//		 
//		 temp.next = newNode;
//		 newNode.previous = temp;
//	 }
//	 
//	 void addBeforePosition(int val, int pos)
//	 {
//		 int cnt = 1;
//		 DoublyNode previous = head, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 DoublyNode newNode = new DoublyNode(val);
//		 if(pos == 1) {
//			 addAtFirst(val);
//			 return;
//		 }
//		 
//		 temp = head;
//		 while(temp.next != null && cnt < pos)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		 
//		 newNode.next = previous.next;
//		 previous.next = newNode;
//		 newNode.previous = previous;
//		 temp.previous = newNode;
//	 }
//	 
//	 void addAfterPosition(int val, int pos)
//	 {
//		 int cnt = 1;
//		 DoublyNode previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 DoublyNode newNode = new DoublyNode(val);
//		 
//		 if(pos == 1)
//		 {
//			 newNode.next = head.next;
//			 newNode.previous = head;
//			 head.next = newNode;
//			 if(head.next != null)
//			 {
//				 head.next.previous = newNode;
//			 }
//			 return;
//		 }
//		 	 
//		 temp = head;
//		 while(temp.next != null && cnt < pos)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//			 cnt++;
//		 }
//		 
//		 if(cnt < pos) {
//			 System.out.println("Insufficient Node in the linkedlist");
//			 return;
//		 }
//		  
//		 
//		 newNode.next = temp.next;
//		 temp.next = newNode;
//		 newNode.previous = temp;
//		 if(temp.next != null)
//			 temp.next.previous = newNode;
//	 }
//	 	 
//	 void addAtFirst(int val)
//	 {
//		 DoublyNode newNode = new DoublyNode(val);
//		 if(head == null) {
//			 head = newNode;		
//			 return;
//		 }
//		 
//		 newNode.next = head;
//		 head.previous = newNode;
//		 head = newNode;
//	 }
//	 
//	 void removeFirst()
//	 {
//		 if(head == null) {
//			System.out.println("No Node in Linkelist");
//			 return;
//		 }
//		 
//		 if(head.next == null) 
//		 {
//			 head = null;
//			 return;
//		 }
//		 head = head.next;
//		 head.previous = null;
//	 }
//	 
//	 void removeLast()
//	 {
//		 if(head == null) {
//				System.out.println("No Node in Linkelist");
//				 return;
//		 }
//		 
//		 if(head.next == null) 
//		 {
//			 head = null;
//			 return;
//		 }
//		 
//		 DoublyNode temp = head, pre = null;
//		 
//		 while(temp.next != null) 
//		 { 
//			 pre = temp;
//			 temp = temp.next;
//		 }
//		 
//		 pre.next = temp.next;
//	}
//	
//	 // or position
//	 void removeNode(int value)
//	 {	
//		 DoublyNode previous = null, temp = null;
//		 
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 if(head.data == value)
//		 {
//			 removeFirst();
//			 return;
//		 }
//		 
//		 temp = head;
//		 while(temp != null && temp.data != value)
//		 {
//			 previous = temp;
//			 temp = temp.next;
//		 }
//		 
//		 if(temp == null) {
//			 System.out.println("No Element Found.");
//			 return;
//		 }
//		 
//		 previous.next = temp.next;
//		 if(temp.next != null)
//			 temp.next.previous = previous;
//	 }
//	 
//	 void display()
//	 {
//		 if(head == null) {
//			 System.out.println("Linkedlist is empty");
//			 return;
//		 }
//		 
//		 System.out.println("Elements Of linkedlist...");
//		 	
//		DoublyNode temp = head;
//		 while(temp != null)
//		 {
//			 System.out.println(temp.data + " ");
//			 temp = temp.next;
//		 }
//		
//	 }
// }
// 
// 
// /////////////// Stack /////////////////
// 
// // Implement stack Using Array
// 
// class Stack
// {
//	 int stack[];
//	 int SIZE = 10;
//	 int top = -1;
//	 
//	 Stack(){
//		 stack = new int[SIZE];
//	 }
//	 
//	 void push(int val)
//	 {
//		 if(isFull())
//		 {
//			 System.out.println("Opps.. Stack is Full");
//			 return;
//		 }
//		 
//		 stack[++top] = val;
//	 }
//	 
//	 int pop()
//	 {
//		 if(isEmpty())
//		 {
//			 System.out.println("Opps.. Stack is Empty");
//			 return 0;
//		 }
//		 
//		 int value = stack[top--];
//		 return value;
//	 }
//	 
//	 boolean isEmpty()
//	 {
//		 if(top == -1) return true;
//		 return false;
//	 }
//	 
//	 boolean isFull()
//	 {
//		 if(top == SIZE - 1)
//			 return true;
//		 return false;
//	 }
//	 
//	 int peek()
//	    {
//	        if (top < 0) {
//	            System.out.println("Stack Underflow");
//	            return 0;
//	        }
//	        else {
//	            int x = stack[top];
//	            return x;
//	        }
//	    }
//	 
//	 
//	 void display()
//	 {		 
//		 System.out.println("Elements Of Stack");
//		 for(int i = 0; i <= top; i++)
//		 {
//			 System.out.print(stack[i] +" ");
//		 }
//	 }
// }
// 
// 
// // Implement Simple Queue Using Array
// 
// class Queue
// {
//	 int front, rear;
//	 int queue[];
//	 int SIZE = 10;
//	 public Queue() {
//		 front = -1;
//		 rear = -1;
//		 queue = new int[SIZE];
//	}
//	 
//	 void enqueue(int val)
//	 {
//		 if(isFull()) {
//			 System.out.println("Queue Overflow..");
//			 return;
//		 }
//		 
//		 if(front == -1) front = 0;
//		 queue[++rear] = val;
//	 }
//	 
//	 int dequeue()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 
//		 int val = queue[front];
//		 if(front == rear) front = rear = -1;
//		 else front++;
//		 
//		 return val;
//	 }
//	 
//	 int front()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 return queue[front];
//	 }
//	 
//	 int rear()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 return queue[rear];
//	 }
//	 
//	 boolean isEmpty()
//	 {
//		 if(front == -1) return true;
//		 return false;
//	 }
//	 
//	 boolean isFull()
//	 {
//		 if(rear == SIZE - 1) return true;
//		 return false;
//	 }
//	 
//	 
//	 void display()
//	 {
//		 if(isEmpty())
//		 {
//			 System.out.println("Queue is Empty..");
//			 return;
//		 }
//			 
//		 System.out.println("Elements Of Queue..");
//		 for(int i = front; i <= rear; i++)
//			 System.out.print(queue[i] + " ");
//
//	 }
// }
// 
////Implement Circular Queue Using Array
// class CircularQueue
// {
//	 int front, rear;
//	 int queue[];
//	 int SIZE = 10;
//	 public CircularQueue() {
//		 front = -1;
//		 rear = -1;
//		 queue = new int[SIZE];
//	}
//	 
//	 void enqueue(int val)
//	 {
//		 if(isFull()) {
//			 System.out.println("Queue Overflow..");
//			 return;
//		 }
//		 
//		 if(front == -1) front = 0;
//		 rear = (rear + 1) % SIZE;
//		 queue[rear] = val;
//	 }
//	 
//	 int dequeue()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 
//		 int val = queue[front];
//		 if(front == rear) front = rear = -1;
//		 else front = (front + 1) % SIZE;
//		 
//		 return val;
//	 }
//	 
//	 int front()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 return queue[front];
//	 }
//	 
//	 int rear()
//	 {
//		 if(isEmpty()) 
//		 {
//			 System.out.println("Queue Underflow..");
//			 return 0; 
//		 }
//		 return queue[rear];
//	 }
//	 
//	 boolean isEmpty()
//	 {
//		 if(front == -1) return true;
//		 return false;
//	 }
//	 
//	 boolean isFull()
//	 {
//		 if((front == 0 && rear == SIZE - 1) || rear == front - 1) return true;
//		 return false;
//	 }
//	 
//	 
//	 void display()
//	 {
//		 if(isEmpty())
//		 {
//			 System.out.println("Queue is Empty..");
//			 return;
//		 }
//			 
//		 System.out.println("Elements Of Queue..");
//		 int i = front;
//		 for (i = front; i != rear; i = (i + 1) % SIZE)
//			 System.out.print(queue[i] + " ");
//		 System.out.print(queue[i] + " ");
//	 }
// }
// 
// 
////Implement DeQueue Using Array
//
//class DequeImpl
//{
//	int deque[];
//	int capacity;
//	int front, rear;
//	public DequeImpl(int size) {
//		capacity = size;
//		
//		deque = new int[capacity];
//		front = rear = -1;
//	}
//	
//	void enqueueFront(int val)
//	{
//		if(isFull())
//		{
//			System.out.println("Queue Overflow..");
//			return;
//		}
//		
//		if(front == -1) {
//			front = 0;
//			rear = 0;
//		}
//		else if(front == 0)
//			front = capacity - 1;
//		else front = front - 1;
//		
//		deque[front] = val;
//	}
//	
//	void enqueueRear(int val)
//	{
//		if(isFull())
//		{
//			System.out.println("Queue Overflow..");
//			return;
//		}
//		
//		if(front == -1) {
//			front = 0;
//			rear = 0;
//		}
//		else if(rear == capacity - 1)
//			rear = 0;
//		else rear = rear + 1;
//		
//		deque[rear] = val;
//	}
//	
//	int dequeueFront()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Queue UnderFlow..");
//			return 0;
//		}
//		
//		//if queue has only one element
//		int val = deque[front];
//		if(front == rear) front = rear = -1;
//		else if(front == capacity - 1) front = 0;
//		else front = front + 1;
//			
//			
//		return val;
//	}
//	
//	int dequeueRear()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Queue UnderFlow..");
//			return 0;
//		}
//		
//		//if queue has only one element
//		int val = deque[rear];
//		if(front == rear) front = rear = -1;
//		else if(rear == 0) rear = capacity - 1;
//		else rear = rear - 1;
//			
//			
//		return val;
//	}
//	
//	
//	boolean isEmpty()
//	{
//		if(front == -1) return true;
//		return false;
//	}
//	
//	boolean isFull()
//	{
//		if((front == 0 && rear == capacity - 1) || rear == front -  1) return true;
//		return false;
//	}
//	
//	int rear()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Queue UnderFlow..");
//			return 0;
//		}
//		
//		return deque[rear];
//	}
//	
//	int front()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Queue UnderFlow..");
//			return 0;
//		}
//		
//		return deque[front];
//	}
//}
// class Solution
// {
//	 public static void main(String[] args)
//	 {
////		 Stack stack = new Stack();		
////		 stack.push(10);
////		 stack.push(20);
////		 
////		 stack.display();
////		 
////		 stack.pop();
////		 stack.pop();
////		 
////		 stack.display();
//		 
////
////		 Queue queue = new Queue();
////		 
////		 queue.enqueue(10);
////		 queue.enqueue(20);
////		 queue.enqueue(30);
////		 queue.enqueue(40);
////		 
////		 queue.dequeue();
////		 queue.dequeue();
////		 queue.dequeue();
////		 queue.dequeue();
////		 
////		 queue.display();
//		 
////		 CircularQueue circularQueue = new CircularQueue();
////		 circularQueue.enqueue(10);
////		 circularQueue.enqueue(20);
////		 circularQueue.enqueue(30);
////		 circularQueue.enqueue(40);
////		 circularQueue.enqueue(50);
////		 circularQueue.enqueue(60);
////		 circularQueue.enqueue(70);
////		 circularQueue.enqueue(80);
////		 circularQueue.enqueue(90);
////		 circularQueue.enqueue(100);
////		 
////		 
////		 circularQueue.dequeue();
////		 circularQueue.dequeue();
////		 circularQueue.dequeue();
////		 circularQueue.dequeue();
////		 circularQueue.enqueue(100);
////		 circularQueue.enqueue(100);
////		 circularQueue.enqueue(100);
////		 circularQueue.enqueue(100);
////		 circularQueue.enqueue(100);
//////		 
////		 circularQueue.display();
//		 
////		 java.util.Deque<Integer> deque = new LinkedList<>();
////		 deque.addFirst(10);
////		 deque.addFirst(20);
////		 
////		 while(!deque.isEmpty())
////			 System.out.println(deque.removeLast());
//		 
////		 DequeImpl dequeImpl = new DequeImpl(5);
////		 dequeImpl.enqueueRear(10);
////		 dequeImpl.enqueueFront(15);
////		 dequeImpl.enqueueRear(20);
////		 dequeImpl.enqueueRear(10);
////		 dequeImpl.enqueueFront(15);
////		// dequeImpl.enqueueRear(20);
////		 
////		 System.out.println(dequeImpl.dequeueFront());
////		 System.out.println(dequeImpl.front());
////		 System.out.println(dequeImpl.dequeueRear());
////		 System.out.println(dequeImpl.rear());
////		 System.out.println(dequeImpl.front());
////		 System.out.println(dequeImpl.dequeueFront());
////		 System.out.println(dequeImpl.front());
//		 
//		 //Singly
////		 LinkedList l1 = new LinkedList();
////		 
////		 l1.addAtLast(10);
////		 l1.addAtLast(20);
////		 l1.addAtLast(30);
////		 
////		 l1.addAtFirst(5);
////		 
////		 l1.addAfterPosition(7, 4);
////		 
////		 l1.addBeforePosition(2, 1);
////		 
////		 l1.removeFirst();
////		 
////		 l1.removeLast();
////		 
////		 l1.removeNode(30);
////		 
////		 l1.display();
//		 
////		 CircularLinkedList l1 = new CircularLinkedList();
////		 
////		 l1.addAtLast(10);
////		 l1.addAtLast(20);
////		 l1.addAtLast(30);
//////		 
////		 l1.addAtFirst(5);
////		 
////		 l1.addAtFirst(1);
//////		 
////		 l1.addAfterPosition(7, 5);
//////		 
////		 l1.addBeforePosition(2, 2);
//////		 
////		 l1.removeFirst();
////		 
////		 l1.removeFirst();
//////		 
////		 l1.removeLast();
////		 
//////		 l1.removeLast();
//////		 
//////		 l1.removeNode(20);
//////		 
////		 l1.display();
//		 
//		 DoublyLinkedList d1 = new DoublyLinkedList();
//		 d1.addAtLast(10);
//		 d1.addAtLast(20);
//		 d1.addAtLast(30);
//		 d1.addAtLast(40);
//		 d1.addAtLast(50);
//		 
////		 d1.addAtFirst(1);
////		 d1.addAtFirst(2);
////		 d1.addAtFirst(3);
////		 d1.addAtFirst(4);
////		 d1.addAtFirst(5);
//		 
//		 d1.addAfterPosition(15, 5);
//		 
//		 d1.addBeforePosition(1, 6);
//		 
//		 d1.removeFirst();
//		 
//		 d1.removeLast();
//		 
//		 d1.removeNode(50);
//		 
//		 d1.display();
//		 
//	 }
// }
// 

//////start from end Intuitive Approach Array - next greater element right Stack
//class Solution {
//public static int[] nextGreaterElement(int[] nums) {
//   int length = nums.length;
//  
//   int answer[] =new int[length];
//   Stack<Integer> stack = new Stack<>();
//   for(int i = length - 1, j = 0; i >=0; i--, j++)
//   {
//       // remove all the element which are smaller then nums[i]
//       while(!stack.isEmpty() && stack.peek() <= nums[i])
//           stack.pop();
//       if(stack.isEmpty())
//           answer[i] = -1;
//       else answer[i] = stack.peek();
//       
//       stack.push(nums[i]);
//           
//   }
//   
//
//   return answer;
//}
//public static void main(String[] args)
//{
//	 nextGreaterElement(new int[] {1,2,3,5,7,6});
//}
//}

////// just start from 0 Intuitive Approach Array - next greater element left Stack
//class Solution {
//public static int[] nextGreaterElement(int[] nums) {
//   int length = nums.length;
//  
//   int answer[] =new int[length];
//   Stack<Integer> stack = new Stack<>();
//   for(int i = 0; i < length; i++)
//   {        
//       while(!stack.isEmpty() && stack.peek() <= nums[i])
//           stack.pop();
//       if(stack.isEmpty())
//           answer[i] = -1;
//       else answer[i] = stack.peek();
//       
//       stack.push(nums[i]);
//           
//   }
//   
//
//   return answer;
//}
//public static void main(String[] args)
//{
//	 nextGreaterElement(new int[] {1,2,3,5,7,6});
//}
//}

//////start from end Intuitive Approach Array - next smaller element right Stack
//class Solution {
//public static int[] nextGreaterElement(int[] nums) {
//int length = nums.length;
//
//int answer[] =new int[length];
//Stack<Integer> stack = new Stack<>();
//for(int i = length - 1, j = 0; i >=0; i--, j++)
//{
//    // remove all the element which are smaller then nums[i]
//    while(!stack.isEmpty() && stack.peek() >= nums[i])
//        stack.pop();
//    if(stack.isEmpty())
//        answer[i] = -1;
//    else answer[i] = stack.peek();
//    
//    stack.push(nums[i]);
//        
//}
//
//
//return answer;
//}
//public static void main(String[] args)
//{
//	 nextGreaterElement(new int[] {1,2,3,5,7,6});
//}
//}

////start from end Intuitive Approach Array - next smaller element left Stack
//class Solution {
//public static int[] nextGreaterElement(int[] nums) {
//int length = nums.length;
//
//int answer[] =new int[length];
//Stack<Integer> stack = new Stack<>();
//for(int i = 0; i < length; i++)
//{
// // remove all the element which are smaller then nums[i]
// while(!stack.isEmpty() && stack.peek() >= nums[i])
//     stack.pop();
// if(stack.isEmpty())
//     answer[i] = -1;
// else answer[i] = stack.peek();
// 
// stack.push(nums[i]);
//     
//}
//
//
//return answer;
//}
//public static void main(String[] args)
//{
//	 nextGreaterElement(new int[] {1,2,3,5,7,6});
//}
//}

// Circular Array - next greater element Stack - naive
// class Solution {
//	    public static int[] nextGreaterElements(int[] nums) {
//	        int length = nums.length;
//	        int answer[] = new int[length];
//	        
//	        for(int i = 0;i < length; i++)
//	        {
//	          
//	            int j = (i + 1) % length;
//	            answer[i]= -1;
//	            while(j  % length != i)
//	            {
//	                if(nums[j] > nums[i])
//	                {
//	                    answer[i] = nums[j];
//	                    break;
//	                }
//	                j = (j + 1) % length;
//	            }
//	        }
//	        
//	        return answer;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	nextGreaterElements(new int[] {1,2,3,4,3});
//	    }
//	}
// 

////Intuitive Approach Circular Array - next greater element II Stack
//class Solution {
//public static int[] nextGreaterElement(int[] nums) {
// int length = nums.length;
//
// int answer[] =new int[length];
// Stack<Integer> stack = new Stack<>();
// for(int i = 2 * length - 1; i >=0; i--)
// {
//     // remove all the element which are smaller then nums[i]
//     while(!stack.isEmpty() && stack.peek() <= nums[i % length])
//         stack.pop();
//     if(i < length)
//     {
//	     if(stack.isEmpty())
//	         answer[i] = -1;
//	     else answer[i] = stack.peek();
//     }    
//     stack.push(nums[i % length]);
//         
// }
// 
//
// return answer;
//}
//public static void main(String[] args)
//{
// nextGreaterElement(new int[] {1,2,3,5,7,6});
//}
//}

// Largest Ractangle Histogram
// class Solution {
//	    public static int largestRectangleArea(int[] heights) {
//	        int length = heights.length;
//	        int ngl[] = new int[length];
//	        int ngr[] = new int[length];
//	        
//	        int maxArea = Integer.MIN_VALUE;
//	        Stack<Integer> stack = new Stack<>();
//	        
//	        for(int i = 0; i < length; i++)
//	        {
//	            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
//	            
//	            if(stack.isEmpty()) ngl[i] = -1;
//	            else ngl[i] = stack.peek();
//	            
//	            stack.push(i);
//	        }
//	        
//	        stack.clear();
//	        
//	        
//	        for(int i = length - 1; i >=0;  i--)
//	        {
//	             while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
//	            
//	            if(stack.isEmpty()) ngr[i] = length;
//	            else ngr[i] = stack.peek();
//	            
//	            stack.push(i);
//	        }
//	        
//	        
//	        for(int i = 0;i < length; i++)
//	            maxArea = Math.max(maxArea, heights[i] * (ngr[i] - ngl[i] - 1));
//	            
//	        return maxArea;
//	    }
//	    
//	   public static void main(String[] args)
//	   {
//		   largestRectangleArea(new int[] {2,1,5,6,2,3});
//	   }
//	}

// class MinStack {
//	    Stack<Integer> stack;
//	    Stack<Integer> supportStack;
//	    public MinStack() {
//	        stack = new Stack<>();
//	        supportStack = new Stack<>();
//	    }
//	    
//	    public void push(int val) {
//	        if(supportStack.isEmpty() || val <= supportStack.peek()) 
//	            supportStack.push(val);
//	        stack.push(val);
//	    }
//	    
//	    public void pop() {
//	    	System.out.println(stack.peek() + " " + supportStack.peek());
//	        if(Integer.compare(stack.peek(), supportStack.peek()) == 0) 
//	        	supportStack.pop();
//	        stack.pop();
//	    }
//	    
//	    public int top() {
//	        return stack.peek();
//	    }
//	    
//	    public int getMin() {
//	        return supportStack.peek();
//	    }
//	}
//public class Solution
//{
//	public static void main(String[] args)
//	{
//		MinStack m1 = new MinStack();
//		m1.push(512);
//		m1.push(-1024);
//		m1.push(-1024);
//		m1.push(512);
//	
//		m1.pop();
//		m1.pop();
//		m1.pop();
//		
//	}
//}
//
//
//	/**
//	 * Your MinStack object will be instantiated and called as such:
//	 * MinStack obj = new MinStack();
//	 * obj.push(val);
//	 * obj.pop();
//	 * int param_3 = obj.top();
//	 * int param_4 = obj.getMin();
//	 */

//Find the maximum of minimums of every window size
//import java.util.*;

//public class Solution {
////      static int findMax(int nums[])
////      {
////          int max = Integer.MIN_VALUE;
////          int length = nums.length;
////          for(int i = 0; i < length; i++)
////              max = Math.max(nums[i], max);
     
////          return max;
////      }
 
////      static void findMaximum(List<Integer> answer, int nums[], int n)
////      {
////          if(n == 0) return;

     
////          Deque<Integer> deque = new LinkedList<>();
////          int length = nums.length;
////          int min[] = new int[length - n + 1];
////          int pos = 0;
////          for(int i = 0; i < length; i++)
////          {
////              if(!deque.isEmpty() && (i - n) == deque.peek()) deque.removeFirst();
         
         
////              while(!deque.isEmpty() && nums[deque.getLast()] >= nums[i])
////                  deque.removeLast();
         
////              deque.offer(i);
         
////              if(i >= n - 1)
////                  min[pos++] = nums[deque.peek()];
////          }
//// //          PriorityQueue<Integer> pq = new PriorityQueue<>();
//// //          for(i = 0; i < n; i++)
//// //              pq.offer(nums[i]);
     
     
//// //          int min[] = new int[nums.length - n + 1];
//// //          int pos = 0;
//// //          min[pos] = pq.peek();
//// //          for(int j = i; j < nums.length; j++)
//// //          {
//// //              pq.remove(nums[pos++]);
//// //              pq.offer(nums[j]);
//// //              min[pos] = pq.peek();
//// //          }
     
////          answer.add(findMax(min));
     
////          findMaximum(answer, nums, n - 1);
////      }   
     
 
 
//  public static int[] maxMinWindow(int[] arr, int n) {
//      // Write your code here
////          int answer[] = new int[n];
////          List<Integer> list = new LinkedList<>();
     
////          findMaximum(list, a, n);
     
////          for(int i = n - 1, j = 0; i >= 0; i--, j++)
////              answer[j] = list.get(i);
    
////          return answer;
     
////          int nsl[] = new int[n+1];
////          int nsr[] = new int[n+1];
     
////          Stack<Integer> stack = new Stack<>();
     
////          for(int i = 0;i < n; i++)
////          {
////              while(!stack.isEmpty() && a[stack.peek()] >= a[i]) stack.pop();
             
////              if(stack.isEmpty()) nsl[i] = -1;
////              else nsl[i] = stack.peek();
////              stack.push(i);
////          }
////          stack.clear();
////           for(int i = n - 1;i >= 0; i--)
////          {
////              while(!stack.isEmpty() && a[stack.peek()] >= a[i]) stack.pop();
             
////              if(stack.isEmpty()) nsr[i] = n;
////              else nsr[i] = stack.peek();
////              stack.push(i);
////          }
////          int answer[] = new int[n+1];
     
////          for(int i = 0;i < n; i++)
////          {
////              int index = nsr[i] - nsl[i] - 1;
         
////              answer[index] = Math.max(answer[index], a[i]);
////          }
     
////          for(int i= n - 1; i>=0; i--)
////              answer[i] = Math.max(answer[i], answer[i + 1]);
////          int newAns[] = new int[n];
//      Stack<Integer> s = new Stack<>();
  
//     // Arrays to store previous and next smaller
//     int left[] = new int[n+1]; 
//     int right[]  = new int[n+1];
  
//     // Initialize elements of left[] and right[]
//     for (int i=0; i<n; i++)
//     {
//         left[i] = -1;
//         right[i] = n;
//     }
  
//     // Fill elements of left[] using logic discussed on
//     // https://www.geeksforgeeks.org/next-greater-element/
//     for (int i=0; i<n; i++)
//     {
//         while (!s.empty() && arr[s.peek()] >= arr[i])
//             s.pop();
  
//         if (!s.empty())
//             left[i] = s.peek();
  
//         s.push(i);
//     }
  
//     // Empty the stack as stack is
//// going to be used for right[]
//     while (!s.empty())
//         s.pop();
  
//     // Fill elements of right[] using same logic
//     for (int i = n-1 ; i>=0 ; i-- )
//     {
//         while (!s.empty() && arr[s.peek()] >= arr[i])
//             s.pop();
  
//         if(!s.empty())
//             right[i] = s.peek();
  
//         s.push(i);
//     }
  
//     // Create and initialize answer array
//     int ans[] = new int[n+1];
//     for (int i=0; i<=n; i++)
//         ans[i] = 0;
  
//     // Fill answer array by comparing minimums of all
//     // lengths computed using left[] and right[]
//     for (int i=0; i<n; i++)
//     {
//         // length of the interval
//         int len = right[i] - left[i] - 1;
  
//         // arr[i] is a possible answer for this length
//         // 'len' interval, check if arr[i] is more than
//         // max for 'len'
//         ans[len] = Math.max(ans[len], arr[i]);
//     }
  
//     // Some entries in ans[] may not be filled yet. Fill
//     // them by taking values from right side of ans[]
//     for (int i=n-1; i>=1; i--)
//         ans[i] = Math.max(ans[i], ans[i+1]);
//       int newAns[] = new int[n];
//      for(int i = 0; i < n; i++)
//      {
//          newAns[i] = ans[i+1];
//      }
//      return newAns;      
//  }
//}
//import java.util.*;
//public class Solution {
//public static int[] maxMinWindow(int[] a, int n) {
//    // Write your code here
//    int [] ps=new int[n];
//    int [] ns=new int[n];
//int [] ans=new int[n];
//    for(int i=0;i<n;i++)
//        ans[i]=Integer.MIN_VALUE;
//    Stack<Integer> s=new Stack<>();
//     for (int i=0;i<n;i++)
//     {
//         while(s.isEmpty()==false && a[s.peek()]>=a[i])
//             s.pop();
//         ps[i]=s.isEmpty()?-1:s.peek();
//         s.push(i);
//     }
//     while(!s.isEmpty())s.pop();
    
//     for (int i=n-1;i>=0;i--)
//     {
//         while(s.isEmpty()==false && a[s.peek()]>=a[i])
//             s.pop();
//         ns[i]=s.isEmpty()?n:s.peek();
//         s.push(i);
//     }
//     for(int i = 0;i < n; i++)
//     {
//         while(!s.isEmpty() && a[s.peek()] >= a[i]) s.pop();
//             
//         if(s.isEmpty()) ps[i] = -1;
//         else ps[i] = s.peek();
//         s.push(i);
//     }
//     s.clear();
//      for(int i = n - 1;i >= 0; i--)
//     {
//         while(!s.isEmpty() && a[s.peek()] >= a[i]) s.pop();
//             
//         if(s.isEmpty()) ns[i] = n;
//         else ns[i] = s.peek();
//         s.push(i);
//     }
//    for(int i=0;i<n;i++)
//    {
//        ns[i]=ns[i]-ps[i]-1;
//    }
//    for(int i=0;i<n;i++)
//    {
//        ans[ns[i]-1]=Math.max(a[i],ans[ns[i]-1]);
//    }
//    for(int i=n-2;i>=0;i--)
//        //if(ans[i]==Integer.MIN_VALUE)
//        ans[i]=Math.max(ans[i],ans[i+1]);
//    return ans;
//}
//}

    // Celebrity Problem
//    class Solution
//    { 
//        //Function to find if there is a celebrity in the party or not.
//    	static  int celebrity(int M[][], int n)
//        {
//            int row = M.length;
//        	for(int i = 0; i < n; i++)
//        	{
//        	    int j = 0, k = 0;
//        	    for(j = 0;j < n; j++)
//        	    {
//        	        if(j != i && M[j][i] != 1) break;
//        	    }
//        	    
//        	    for(k = 0;k < n; k++)
//        	    {
//        	        if(M[i][k] != 0) break;
//        	    }
//        	    
//        	    if(j == n && k == n) return i;
//        	}
//        	   return -1;
//        }
//        public static void main(String[] args)
//        {
//        	int mat[][] = {{0,1,0},{0,0,0},{0,1,0}};
//        	celebrity(mat, 3);
//        }
//    }


 // Implement stack using queue
    
//class StackImplQueue
//{
//	Queue<Integer> queue;
//	public StackImplQueue() {
//		queue = new LinkedList<Integer>();
//	}
//	
//	
//	public void push(int val)
//	{
//		queue.add(val);
//		for(int i = 1; i < queue.size(); i++)
//			queue.add(queue.remove());
//	}
//	
//	int pop()
//	{
//		return queue.remove();
//	}
//	
//	int peek()
//	{
//		return queue.peek();
//	}
//}
//
// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		 StackImplQueue s1 = new StackImplQueue();
//		 s1.push(10);
//		 s1.push(20);
//		 s1.push(30);
//		 
//		 System.out.println(s1.pop());
//		 System.out.println(s1.peek());
//		 
//	 }
// }
// 
 
 
//Implement queue using stack
// class QueueImplStack
// {
//	 Stack<Integer> input;
//	 Stack<Integer> output;
//	 
//	 
//	 public QueueImplStack() {
//		 input = new Stack<>();		 
//		 output = new Stack<>();
//	}
//	 
//	 void enQueue(int val)
//	 {
//		 input.push(val);
//	 }
//	 
//	 int dequeue()
//	 {
//		 if(output.isEmpty())
//		 {
//			 while(!input.isEmpty())
//				 output.push(input.pop());
//		 }
//		 
//		 return output.pop();
//	 }
//	 
//	 int peek()
//	 {
//		 if(output.isEmpty())
//		 {
//			 while(!input.isEmpty())
//				 output.push(input.pop());
//		 }
//		 
//		 return output.peek();
//	 }
// }
// 
// class Solution
// {
//	 public static void main(String[] args)
//	 {
//		 QueueImplStack queueImplStack = new QueueImplStack();
//		 queueImplStack.enQueue(10);
//		 queueImplStack.enQueue(20);
//		 queueImplStack.enQueue(30);
//		 
//		 System.out.print(queueImplStack.peek());
//		 System.out.print(queueImplStack.dequeue());
//		 System.out.print(queueImplStack.dequeue());
//		 System.out.print(queueImplStack.dequeue());
//		 queueImplStack.enQueue(10);		
//		 System.out.println(queueImplStack.peek());
//	 }
// }

//	class ListNode
//	{
//	    int val;
//	    int key;
//	    ListNode pre;
//	    ListNode next;
//	    
//	    ListNode(int val, int key)
//	    {
//	    	this.key = key;
//	        this.val = val;
//	        this.pre = null;
//	        this.next = null;
//	    }
//	}
//	
//	
//	
//	class LRUCache {
//	    int size;
//	    ListNode head, tail;
//	    HashMap<Integer, ListNode> hashmap;
//	    public LRUCache(int capacity) {
//	        head = new ListNode(0,0);
//	        tail = new ListNode(0,0);
//	        
//	        head.next = tail;
//	        tail.pre = head;
//	        
//	        this.size = capacity;
//	        hashmap = new HashMap<>();
//	    }
//	    
//	    public int get(int key) {
//	        if(hashmap.containsKey(key))
//	        {
//	            int val = hashmap.get(key).val;
//	            
//	            tail.pre.pre.next = tail;
//	            tail.pre = tail.pre.pre;
//	            
//	             ListNode newNode = new ListNode(val, key);
//	             newNode.next = head.next;
//	             newNode.pre = head;
//	             head.next.pre = newNode;
//	             head.next = newNode;
//	            
//	             hashmap.put(key, newNode);
//	            
//	            return val;
//	        }
//	        
//	        
//	        return -1;
//	    }
//	    
//	    public void put(int key, int value) {
//	        
//	        while(hashmap.size() == size || hashmap.containsKey(key))
//	        {
//	        	int val = tail.pre.key;
//	            tail.pre.pre.next = tail;
//	            tail.pre = tail.pre.pre;
//	            
//	            hashmap.remove(val);
//	        }
//	         ListNode newNode = new ListNode(value, key);
//	         newNode.next = head.next;
//	         newNode.pre = head;
//	         head.next.pre = newNode;
//	         head.next = newNode;
//	        
//	         hashmap.put(key, newNode);
//	    }
//	   
//	}
//
//
//class Solution
//{
//	 public static void main(String[] args)
//	    {
//	    	LRUCache l1 = new LRUCache(2);	    
//	    	l1.put(2, 6);
//	    	l1.get(1);
//	    	l1.put(1, 5);	    
//	    	l1.put(1, 2);
//	    	l1.get(1);
//	    	l1.get(2);
//	    }
//}


// on own Maximal Ractangle Area
//class Solution {
//    
//    static int countRactangle(char[][] matrix, int row, int col, int totalRow, int totalCol)
//    {
//        int tillEnd = col;
//        int r = row;
//        int c = col;
//        int max = 0;
//        while(tillEnd < totalCol && matrix[row][tillEnd] == '1') tillEnd++; 
//        
//        while(row < totalRow && matrix[row][c] == '1')
//        {
//            while(col < tillEnd && matrix[row][col] == '1') col++;
//            
//            tillEnd = col;
//            row++;
//            
//            max = Math.max(max, (row - r) * (col - c));
//        }
//        
//        return max;
//    }
//    
//    
//    public static int maximalRectangle(char[][] matrix) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//        int largestRactangle = Integer.MIN_VALUE;
//        for(int i = 0;i < row; i++)
//        {
//            for(int j = 0; j < col; j++)
//            {
//                if(matrix[i][j] == '1')
//                    largestRactangle = Math.max(largestRactangle, countRactangle(matrix,i,j, row, col));
//            }
//        }
//        return largestRactangle;    
//    }
//    
//    public static void main(String[] args)
//    {
//    	char matrix[][] = {{'1','0','1','0','0'},
//    			{'1','0','1','1','1'},
//    			{'1','1','1','1','1'},
//    			{'1','0','0','1','0'},};
//    	maximalRectangle(matrix);
//    }
//}

// Maximul Rectangle area - Using Stack
//class Solution {   
// static void createLeftSmaller(int arr[], int nsl[], int n)
// {
//     Stack<Integer> stack = new Stack<>(); 
//     for(int i = 0; i < n ; i++)
//     {
//         while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
//         
//         if(stack.isEmpty()) nsl[i] = -1;
//         else nsl[i] = stack.peek();
//         
//         
//         stack.push(i);
//     }
// }
// 
//  static void createRightSmaller(int arr[], int nsr[], int n)
// {
//     Stack<Integer> stack = new Stack<>(); 
//     for(int i = n - 1; i >= 0 ; i--)
//     {
//         while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
//         
//         if(stack.isEmpty()) nsr[i] = -1;
//         else nsr[i] = stack.peek();
//         
//         
//         stack.push(i);
//     }
// }
// 
// 
// static int lrh(int arr[], int n)
// {
//     int nsl[] = new int[n];
//     int nsr[] = new int[n];
//     
//     createLeftSmaller(arr, nsl, n);
//     createRightSmaller(arr, nsr, n);
//     int max = 0; 
//     
//     for(int i = 0; i < n; i++)
//         max = Math.max(max, arr[i] * (nsr[i] - nsl[i] - 1));
//     return max;
// }
// 
// public static int maximalRectangle(char[][] matrix) {
//     int row = matrix.length;
//     int col = matrix[0].length;
//     
//     int mah[] = new int[col];int max = 0;
//     
//     for(int i = 0; i < row; i++)
//     {
//         for(int j = 0; j < col; j++)
//         {
//             if(matrix[i][j] == '1')
//                 mah[j] += 1;
//             else mah[j] = 0;
//         }
//         
//         max = Math.max(max, lrh(mah, col));
//         
//     }
//     
//     return max;
// }
// public static void main(String[] args)
// {
// 	char matrix[][] = {{'1','0','1','0','0'},
// 			{'1','0','1','1','1'},
// 			{'1','1','1','1','1'},
// 			{'1','0','0','1','0'},};
// 	maximalRectangle(matrix);
// }
//}

//class Solution {
//    
//    
//    public static void swap(int []nums, int index1, int index2)
//    {
//        int temp = nums[index1];
//        nums[index1] = nums[index2];
//        nums[index2] = temp;
//    }
//    
//    public static void reverse(int []nums, int index1,int index2)
//    {
//        while(index1 < index2) swap(nums, index1++, index2--);
//    }
//    
//    public static void nextPermutation(int[] nums) {
//      int length = nums.length;
//      int i = length - 2;
//        
//        // Find peak Element from Rightside
//        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
//        if(i >= 0)
//        {
//            int j = length - 1;
//            while(nums[j] <= nums[i]) j--;
//            swap(nums, i , j);
//        }
//        reverse(nums, i + 1, length - 1);
//    }
//    
//    public static void main(String[] args)
//    {
//    	nextPermutation(new int[] {1,2,8,3,4});
//    }
//}

//
//class Solution {
//    
//    static boolean isValid(char[][] sudoku, int row, int col, char c)
//    {
//        for(int i = 0; i < 9; i++)
//        {
//            if(sudoku[row][i] == c) return false;
//            
//            if(sudoku[i][col] == c) return false;
//            
//            if(sudoku[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
//        }
//        
//        return true;
//    }
//    
//    static boolean solvesudoku(char[][] sudoku)
//    {
//        for(int i = 0;i < sudoku.length; i++)
//        {
//            for(int j = 0; j < sudoku[0].length; j++)
//            {
//                 if(sudoku[i][j] == '.')
//                {
//                      
//                    for(char c = '1'; c <= '9'; c++)
//                    {
//                        if(isValid(sudoku, i, j, c))
//                        {
//                            sudoku[i][j] = c;
//                            if(solvesudoku(sudoku))
//                                return true;
//                             else 
//                                 sudoku[i][j] = '.';                        
//                        }
//                    }
//                     // means no option found so backtrack go to next ch
//                     return false;
//                 }
//            }
//        }
//        return true;
//    }
//    
//    
//    
//    public static void solveSudoku(char[][] board) {
//        solvesudoku(board);
//    }
//    
//    
//    public static void main(String[] args)
//    {
//    	char sudoku[][] = {
//    			{'5','3','.','.','7','.','.','.','.'},
//    			{'6','.','.','1','9','5','.','.','.'},
//    			{'.','9','8','.','.','.','.','6','.'},
//    			{'8','.','.','.','6','.','.','.','3'},
//    			{'4','.','.','.','.','3','.','.','1'},
//    			{'7','.','.','.','2','.','.','.','6'},
//    			{'.','6','.','.','.','.','2','8','.'},
//    			{'.','.','.','.','1','9','.','.','5'},
//    			{'.','.','.','.','8','.','.','7','9'}
//    		}; 
//    	
//    	
//    	solvesudoku(sudoku);
//    }
//}

// Reverse Stack

//class Solution
//{
//	
//	static void insert(Stack<Integer> stack, int value)
//	{
//		if(stack.size() == 0)
//		{
//			stack.push(value);
//			return;
//		}
//			
//		
//		int val = stack.pop();
//		insert(stack, valueStack<Integer> stack = /		stack.push(val);
//	}
//	
//	static void reverseStack(Stack<Integer> stack)
//	{
//		if(stack.size() == 0)
//			return;
//		
//		int val = stack.peek();
//		stack.pop();
//		reverseStack(stack);
//  		insert(stack,val);
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		Stack<Integer>stack = new Stack<Integer>();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		
//		reverseStack(stack);
//	}
//}

//public class Solution {
//	  
//	  public static  boolean isValid(int nums[], int numberOfStudent, int max)
//	  {
//	        int length = nums.length;
//			 int totalStudent = 1;
//			 int sum = 0;
//			 
//			 for(int i = 0; i < length; i++)
//			 {
//				 sum += nums[i];
//				 
//				 if(sum > max)
//				 {
//					 totalStudent++;
//					 sum = nums[i];
//				 }
//				 
//				 if(totalStudent > numberOfStudent)
//					 return false;
//			 }
//			 
//			 return true;
//	  }
//	    
//	    public static  int books(int[] nums, int m) {
//	        int end = 0;
//			 int start = Integer.MIN_VALUE;
//			 int length = nums.length;
//			 
//			 for(int i = 0; i < length; i++)
//			 {
//				 end+=nums[i];
//				 start = Math.max(start, nums[i]);
//			 }
//	     int ans = 0;
//			 while(start <= end)
//			 {
//				 int mid = start + (end - start) / 2;
//				 
//				 if(isValid(nums, m, mid))
//				 {
//					 ans = mid;
//					 end = mid - 1;
//				 }else start = mid + 1;
//			 }
//			 
//			 return ans;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	books(new int[] {12,34, 67, 90}, 2);
//	    }
//	}


//////////////////////////// TREE /////////////////////////

// BFS
class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}


//class Solution
//{
//	static void bfs(TreeNode head)
//	{
//		Queue<TreeNode> queue = new LinkedList<>();
//		List<Integer> answer = new LinkedList<>();
//		queue.add(head);
//		
//		while(!queue.isEmpty())
//		{
//			int size = queue.size();
//			
//			for(int i = 0; i < size; i++)
//			{
//				TreeNode currNode = queue.poll();
//				
//				if(currNode.left != null) queue.add(currNode.left);
//				if(currNode.right!= null) queue.add(currNode.right);
//				
//				answer.add(currNode.val);
//			}
//		}
//		
//		System.out.println(answer);
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		bfs(head);
//		
//	}
//}

// Vertical Order traversal

// this class for maitain the level and the axis values of node
//class Tuple
//{
//	TreeNode node;
//	int level, vertical;
//	
//	public Tuple(TreeNode node, int level, int vertical) {
//		this.node = node;
//		this.level = level;
//		this.vertical = vertical;
//	}
//}

//class Solution
//{
//	static void verticalTraversal(TreeNode node)
//	{
//		// this tree map has key as axis value and inner tree map has key as level and priority QUeue has all the value of level
//		TreeMap<Integer,  TreeMap<Integer, PriorityQueue<Integer>>> treeMap = new TreeMap<>();
//		
//		// Queue has tuple as objecto
//		Queue<Tuple> queue = new LinkedList<>();
//		
//		Tuple tuple = new Tuple(node, 0, 0);
//		
//		queue.add(tuple);
//		
//		while(!queue.isEmpty())
//		{
//	
//				Tuple tuple2 = queue.poll();
//				int level = tuple2.level;
//				int vertical = tuple2.vertical;
//				
//				if(!treeMap.containsKey(vertical))
//					treeMap.put(vertical, new TreeMap<>());
//				
//				if(!treeMap.get(vertical).containsKey(level))
//					treeMap.get(vertical).put(level, new PriorityQueue<>());
//				
//				treeMap.get(vertical).get(level).offer(tuple2.node.val);
//				
//				
//				if(tuple2.node.left != null) queue.add(new Tuple(tuple2.node.left, level + 1, vertical - 1));
//				if(tuple2.node.right != null) queue.add(new Tuple(tuple2.node.right, level + 1, vertical + 1));
//			}		
//	
//		List<List<Integer>> list = new LinkedList<>();
//		for(TreeMap<Integer, PriorityQueue<Integer>> map : treeMap.values())
//		{
//			list.add(new LinkedList<Integer>());
//			         
//			for(PriorityQueue<Integer> pq: map.values())
//			{
//				while(!pq.isEmpty())
//				{
//					list.get(list.size() - 1).add(pq.poll());
//				}
//			}
//		}
//		System.out.println(list);
//	}	
//	
//	public static void main(String[] args)
//	{
//		
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		verticalTraversal(head);
//		
//	}
//}

class Tuple
{
	TreeNode node;
	int vertical;	
	
	public Tuple(TreeNode node, int vertical) {
		this.node = node;		
		this.vertical = vertical;
	}
}


// Bottom View of tree
//class NodeVal
//{
//	int level, value;
//	
//	public NodeVal(int level, int val) {
//		this.level = level;
//		this.value = val;
//	}
//}
//class Solution{
//	
//	static void bottomViewTree(TreeNode head) {
//		Queue<Tuple> queue = new LinkedList<>();
//		
//		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
//		
//		queue.add(new Tuple(head, 0));
//		while(!queue.isEmpty()) {
//			Tuple tuple = queue.poll();
//			int axis = tuple.vertical;
//			TreeNode node = tuple.node;
//			
//		
//			treeMap.put(axis, node.val);
//			
//			if(node.left != null) queue.add(new Tuple(node.left, axis - 1));
//			if(node.right != null) queue.add(new Tuple(node.right, axis + 1));
//		}
//		
//		List<Integer> result = new LinkedList<>();
//		for(Integer val: treeMap.values())
//			result.add(val);
//		
//		System.out.println(result);
//	//	return result;
//	}
//	
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		bottomViewTree(head);
//	}
//}
//class BinaryTreeNode<T> {
//    T data;
//    BinaryTreeNode<T> left;
//    BinaryTreeNode<T> right;
//
//    public BinaryTreeNode(T data) {
//        this.data = data;
//    }
//}

// All traversal In one
//class Pair
//{
//    BinaryTreeNode<Integer> node;
//    int track;
//    
//    Pair(BinaryTreeNode<Integer> node, int t)
//    {
//        this.node = node;
//        this.track = t;
//    }
//}
//public class Solution {
//    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
//        Stack<Pair> stack = new Stack<>();
//        List<List<Integer>> result = new LinkedList<>();
//        List<Integer> inOrder  = new LinkedList<>();
//        List<Integer> preOrder  = new LinkedList<>();
//        List<Integer> postOrder  = new LinkedList<>();
//        
//        stack.push(new Pair(root, 1));
//        while(!stack.isEmpty())
//        {
//            Pair pair = stack.pop();
//            BinaryTreeNode<Integer> node  = pair.node;
//            int track = pair.track;
//            if(track == 1)
//            {
//                preOrder.add(node.data);
//                stack.push(new Pair(node,++track));
//                if(node.left != null) stack.push(new Pair(node.left,1));          
//            }
//            
//            else if(track == 2)
//            {
//                inOrder.add(node.data);            
//                stack.push(new Pair(node,++track));
//                if(node.right != null) stack.push(new Pair(node.right,1));
//            }
//            else if(track == 3)
//            {
//                postOrder.add(node.data);            
//            }
//        }
//        
//     
//        result.add(inOrder);
//        result.add(preOrder);
//        result.add(postOrder);
//        
//        return result;
//    }
//    
//    public static void main(String[] args)
//    {
//    	BinaryTreeNode<Integer> head =  new BinaryTreeNode<Integer>(10);
//		head.left = new BinaryTreeNode<Integer>(20);
//		head.right = new BinaryTreeNode<Integer>(30);
//		head.left.left = new BinaryTreeNode<Integer>(40);
//		head.left.right = new BinaryTreeNode<Integer>(50);
//		head.left.left.left = new BinaryTreeNode<Integer>(60);
//		head.left.left.right = new BinaryTreeNode<Integer>(70);
//		
//		
//		getTreeTraversal(head);
//    }
//}
//public class Solution {
//    public static int[] solve(TreeNode A, int B) {
//        List<Integer> path = new LinkedList<>();
//        
//        Stack<TreeNode> stack = new Stack<>();
//      
//          TreeNode current = A;
//          boolean found = false;
//        while(!stack.isEmpty() || current != null)
//        {
//            while(current != null)
//            {
//                path.add(current.val);
//                if(current.val == B){found = true; break;}
//                stack.push(current);
//                current= current.left;                
//            }
//            if(found) break;
//            current = stack.pop();      
//            path.remove(Integer.valueOf(current.val));
//            current = current.right;
//
//            Queue<TreeNode> queue = new LinkedList<>();
//        
//        }
//        
//        int pos = 0;
//        int size = path.size();
//        int result[] = new int[size];
//        for(int i = 0; i < size; i++)
//        {
//            result[pos++] = path.get(i);
//            System.out.println(result[i]);
//        }
//        
//       
//        return result;
//    }
//    
//    public static void main(String[] args) {
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		solve(head, 50);
//    }
//}

//class Solution {
//    public static String decodeMessage(String key, String message) {
//    	int mod =(int) 1e9 + 7;
//        HashMap<Character, Character> hashmap = new HashMap<>();
//        int keyLength = key.length();
//        int track = 0;
//        char charray[] = new char[26];   
//        int intCh[] = new int[26];
//        for(int i = 0; i < keyLength; i++)
//        {
//            char ch = key.charAt(i);
//            if(ch == ' ') continue;
//            if(intCh[ch - 'a']++ == 0)
//                charray[track++] = ch;
//            // if(!hashmap.containsKey(ch))
//            //     hashmap.put(ch,(char)(track++ + 'a'));
//        }
//        
//        int length = message.length();
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < length; i++)
//        {
//             char ch = message.charAt(i);
//            if(ch == ' ') {sb.append(ch); continue;}
//            sb.append(charray[ch + 'a']);
//        }
//          
//        
//        return sb.toString();   
//    }
//    
//    public static void main(String[] args)
//    {
//    	decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");
//    }
//}


//class Solution
//{
//	static int peopleAware(int n, int forgot, int delay)
//	{
//		long dp[] =  new long[n + 1];
//		dp[1] = 1;
//		long share = 0,res = 0;
//		long mod = (long)1e9 + 7;
//		for(int i = 2; i <=n ;i++)
//		{
//			dp[i] = share = (share + dp[Math.max(i - delay, 0)] - dp[Math.max(i - forgot, 0)] + mod) % mod;
//			
//		}
//		
//		for(int i = n - forgot + 1; i <=n ;i++)
//			res = (res + dp[i])%mod;
//		return (int)res;
//		  result.add(new LinkedList<Integer>(root.val).a);
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		peopleAware(6, 4, 2);
//	}
//}


//}
//public class Solution {
//	public static ArrayList<Integer> traverseBoundary(TreeNode root){
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(root.val);
//        //Get all left bountry
//        Stack<TreeNode> stack = new Stack<>();       
//         TreeNode current = root.left;
//        while(!stack.isEmpty() || current != null)
//        {                  
//            while(current != null)
//            {
//                list.add(current.val);
//                stack.push(current);
//                current = current.left;
//            }
//            
//            current = stack.pop();
//            if(current.left == null && current.right == null)
//            {
//            	list.remove(list.size() - 1);
//            	break;
//            }
//            current = current.right;
//        }
//        
//        stack.clear();
//        // get all leaf node
//        
//          current = root;
//        while(!stack.isEmpty() || current != null)
//        {                     
//            while(current != null)
//            { 
//                 stack.push(current);
//                current = current.left;               
//            }
//            
//            current = stack.pop();
//            if(current.left == null && current.right == null)   list.add(current.val);
//            current = current.right;
//        }
//        stack.clear();
//        // get all right node
//        current = root.right;
//      Stack<Integer> rightTree = new Stack<>();
//       while(!stack.isEmpty() || current != null)
//      {
//          while(current != null)
//            {
//                rightTree.push(current.val);
//                stack.push(current);
//                current = current.right;
//            }
//            
//            current = stack.pop();
//            if(current.left == null && current.right == null)
//            {
//                list.remove(list.size() - 1);
//                break;
//            }
//            current = current.left;
//      }
//      
//      while(!rightTree.isEmpty())
//          list.add(rightTree.pop());
//      
//      return list;
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.right.left = new TreeNode(90);
//		head.right.right = new TreeNode(100);
//		head.right.right.left = new TreeNode(110);
//		head.right.right.right = new TreeNode(120);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		traverseBoundary(head);
//	}
//}

//class Solution
//{
//	public static void main(String[] args)
//	{
////		int N = 10;
////		int M = 8;
////		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
////		
////		int mat[][] = {{1,2},
////				{3,4},
////				{4,5},
////				{6,7},
////				{7,8},
////				{8,9},
////				{9,10},
////				{6,10}};
////         Arrays.sort(mat, (a,b) -> {
////            if(a[0] == b[0])
////                return b[1] - a[1];
////            else return a[0] - b[0];
////            });
////   
////        
////        int start = mat[0][0];
////        int end = mat[0][1];
////        int max1 = 0;
////        int max2 = 0;
////         int ans = 0;
////        int cnt = 1;
////        for(int i = 1; i < mat.length; i++)
////        {
////            int s = mat[i][0];
////            int e = mat[i][1];
////            
////            
////            if(end == s){  end = e; cnt++;}
////            else
////            {
////            	pq.offer(cnt + 1);
////                cnt = 1;
////                start = s;
////                end = e;
////            }
////            
////        }
////        pq.offer(cnt + 1);
////        int max = pq.poll();
////        int max3 = 0;
////        while(!pq.isEmpty())
////        	max3 = pq.poll();
////        System.out.println(max - max3);
////		 long divide =(long) Math.pow(2, 55735);
////		int arr[] = new int[] {2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9, 2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9,2,5,6,4,9,2,5,6,4,9
////				,2,5,6,4,9};
////		  long prod = 1;
////	        int min = Integer.MAX_VALUE;
////	        int j = 0;
////	        for(int i = 0; i < arr.length; i++)
////	        {            
////	           prod *= arr[i];
////	            System.out.println(prod);
////	           while(j <= i && prod % divide == 0)
////	           {
////	               min = Math.min(i - j + 1, min);
////	               prod /= arr[j++];
////	           }
////	        }
////	        
////	        System.out.println(min);
//	}
//}
//class Solution {
//    
//    
//    public static TreeNode connect(TreeNode root) {
//        
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        
//        while(!queue.isEmpty())
//        {
//            int size = queue.size();
//            for(int i = 0; i < size; i++)
//            {
//            	TreeNode current = queue.poll();
//                
//                if(current.left != null)
//                {
//                    queue.offer(current.left);
//                    queue.offer(current.right);
//                }
//                if(i == size - 1) 
//                	current.right = null;
//                else 
//                	current.right = queue.peek();
//            }
//        }
//        
//        return root;    
//    }
//    
//    public static void main(String[] args)
//    {
//    	TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.right.left = new TreeNode(90);
//		head.right.right = new TreeNode(100);
//		head.right.right.left = new TreeNode(110);
//		head.right.right.right = new TreeNode(120);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		connect(head);
//    }
//}
//class Solution {
//	static int i = 0;
//    public static TreeNode bstFromPreorder(int[] arr) {
//        return helper(arr, Integer.MAX_VALUE);
//    }
//
//    public static TreeNode helper(int[] arr, int bound) {
//        if (i == arr.length || arr[i] > bound) return null;
//        TreeNode root = new TreeNode(arr[i++]);
//        root.left = helper(arr, root.val);
//        root.right = helper(arr, bound);
//        return root;
//    }
//    
//    public static void main(String[] args)
//    {
//    	bstFromPreorder(new int[] {8,5,1,7,10,12});
//    }
//	}

//class Solution {
//	// int findAncestor(TreeNode node, TreeNode p, List<TreeNode> list)
////	     {
////	         if(node == null) return 0;
////	         list.add(node);   
////	         if(node.val == p.val) return -1;
//	        
////	         int left = findAncestor(node.left, p, list);
//	        
////	         if(left == -1) return -1;
//	        
////	         int right = findAncestor(node.right,p, list);
////	         if(right == -1) return -1;
////	         list.remove(list.size() - 1);
//	        
//	        
////	         return 0;  
//	// //                 if(node == null) return false;
//	        
//	// //         list.add(node);
//	        
//	// //         if(node.val == p.val) return true;
//	        
//	// //         if(findAncestor(node.left, p, list) || findAncestor(node.right, p, list))
//	// //             return true;
//	            
//	// //         list.remove(list.size() - 1);
//	// //         return false;
////	     }
//	    
//	    
//	    
//	    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
////	         List<TreeNode> pancestor = new LinkedList<>();
////	         List<TreeNode> qancestor = new LinkedList<>();
//	        
////	         findAncestor(root, p, pancestor);
////	         findAncestor(root, q, qancestor);
//	    
////	         int j = 0, i = 0;
////	         int pSize = pancestor.size();
////	         int qSize = qancestor.size();
//	        
////	         // System.out.println(pancestor.val);
////	         // System.out.println(qancestor.val);
////	         TreeNode ans = null;
////	         while(i < pSize && j < qSize && pancestor.get(i).val == qancestor.get(j).val)
////	         {                ans = qancestor.get(j);
//	            
////	             i++;j++;
////	         }
//	        
////	         return ans;
//	        
//	        if(root == null || p == root || q == root) return root;
//	        
//	        TreeNode left = lowestCommonAncestor(root.left, p, q);
//	        TreeNode right = lowestCommonAncestor(root.right, p, q);
//	        
//	        if(left == null) return right;
//	        else if(right == null) return left;
//	        else return root;
//	    }
//	    
//	    public static void main(String[] args)
//	    {
//	    	TreeNode head =  new TreeNode(10);
//			head.left = new TreeNode(20);
//			head.right = new TreeNode(30);
//			head.right.left = new TreeNode(90);
//			head.right.right = new TreeNode(100);
//			head.right.right.left = new TreeNode(110);
//			head.right.right.right = new TreeNode(120);
//			head.left.left = new TreeNode(40);
//			head.left.right = new TreeNode(50);
//			head.left.left.left = new TreeNode(60);
//			head.left.left.right = new TreeNode(70);
//			
//			
//			lowestCommonAncestor(head, head.left.left.right,head.right.left);
//	    }
//	    
//	}

//class Solution {
//    
//    static ListNode reverse(ListNode root, ListNode pre)
//    {
//        if(root == null) return root;
//        
//        ListNode t = (root.next != null) ? (reverse(root.next, root)) : root;
//        root.next = pre;
//        return t;
//        
//    }
//    
//    
//    public static void reorderList(ListNode head) {
//        
//        int cnt = 0;
//        ListNode temp = head;
//        while(temp != null){cnt++;temp = temp.next;}
//        ListNode fast = head;
//        ListNode slow = null;
//        if(cnt % 2 == 0)
//        {
//            ListNode dummy = new ListNode(0);
//            dummy.next = head;
//            slow = dummy;
//            
//            while(fast != null)
//            {
//                fast = fast.next.next;
//                slow = slow.next;
//            }
//        }
//        else
//        {           
//            slow = head;
//            
//            while(fast.next != null)
//            {
//                fast = fast.next.next;
//                slow = slow.next;
//            }
//        }
//        
//        temp = head;
//        ListNode revHead = reverse(slow.next, 
//        		null);
//        slow.next = null;
//       
//        while(temp != null && revHead != null)
//        {
//            revHead.next = temp.next;
//            temp.next = revHead;
//            
//            temp = revHead.next;
//            revHead = temp.next;
//        }
//     
//    }
//    
//    public static void main(String[] args)
//    {
//    	ListNode head = new ListNode(10);
//		head.next = new ListNode(20);
//		head.next.next = new ListNode(30);
//		head.next.next.next = new ListNode(40);
//		
//		
//		reorderList(head);
////		head.next.next.next.next = new ListNode(30);
////		head.next.next.next.next.next = new ListNode(60);
////		head.next.next.next.next.next.next = new ListNode(70);
//    }
//}


class DoublyNode
{
	int val;
	ListNode next, pre;
	
	
	
	public DoublyNode(int val) {
		this.val = val;
		this.next = null;
		this.pre = null;
	}
}


// Convert BT to DDL - I
//class Solution
//{
//	
//	static TreeNode pre;
//	static TreeNode head;
//	
//	public static void bstToDL(TreeNode root)
//	{
//		if(root == null) return;
//		
//		bstToDL(root.left);
//		if(pre == null) head = root;
//		else {
//			root.left = pre;
//			pre.right = root;
//		}
//		pre = root;
//		
//		bstToDL(root.right);
//	}
//	
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.right.left = new TreeNode(90);
//		head.right.right = new TreeNode(100);
//		head.right.right.left = new TreeNode(110);
//		head.right.right.right = new TreeNode(120);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		bstToDL(head);
//		TreeNode temp = Solution.head;
//		while(temp != null)
//		{
//			
//			temp = temp.right;			
//		}
//			
//	}
//	
//}

// Solution 2 - Convert BT to Doubly linkedlist
//class Solution
//{
//	
//	static TreeNode pre;
//	static TreeNode head;
//	
//	
//	 static TreeNode prev;
//	 
//	    // Changes left pointers to work as previous
//	    // pointers in converted DLL The function
//	    // simply does inorder traversal of Binary
//	    // Tree and updates left pointer using
//	    // previously visited node
//	    static void fixPrevptr(TreeNode root)
//	    {
//	        if (root == null)
//	            return;
//	 
//	        fixPrevptr(root.left);
//	        root.left = prev;
//	        prev = root;
//	        fixPrevptr(root.right);
//	 
//	    }
//	 
//	    // Changes right pointers to work
//	    // as next pointers in converted DLL
//	    static TreeNode fixNextptr(TreeNode root)
//	    {       
//	        // Find the right most node in
//	        // BT or last node in DLL
//	        while (root.right != null)
//	            root = root.right;
//	 
//	        // Start from the rightmost node, traverse
//	        // back using left pointers. While traversing,
//	        // change right pointer of nodes
//	        while (root != null && root.left != null)
//	        {
//	        	TreeNode left = root.left;
//	            left.right = root;
//	            root = root.left;
//	        }
//	 
//	        // The leftmost node is head of linked list, return it
//	        return root;
//	    }
//	 
//	    static TreeNode BTTtoDLL(TreeNode root)
//	    {
//	        prev = null;
//	 
//	        // Set the previous pointer
//	        fixPrevptr(root);
//	 
//	        // Set the next pointer and return head of DLL
//	        return fixNextptr(root);
//	    }
//
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.right.left = new TreeNode(90);
//		head.right.right = new TreeNode(100);
//		head.right.right.left = new TreeNode(110);
//		head.right.right.right = new TreeNode(120);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		BTTtoDLL(head); 
//	}
//	
//}

// Convert BT to Circular Doubly linkedlist

//class Solution
//{
//	static TreeNode bstToCircularDDl(TreeNode node)
//	{
//		if(node == null) return null;
//		
//		TreeNode left = bstToCircularDDl(node.left);
//		TreeNode right = bstToCircularDDl(node.right);
//		
//		node.left = node.right = node;
//		
//		
//		return concate(concate(left, node), right);
//	}
//	
//	
//	static TreeNode concate(TreeNode left, TreeNode right)
//	{
//		if(left == null) return right;
//		if(right == null) return left;
//		
//		TreeNode leftlast = left.left;
//		TreeNode rightlastNode = right.left;
//		
//		
//		leftlast.right = rightlastNode;
//		rightlastNode.left = leftlast;
//		
//		
//		leftlast.left = rightlastNode;
//		rightlastNode.right = leftlast;
//		
//		return leftlast;
//	}
//	
//	public static void main(String[] args)
//	{
//		TreeNode head =  new TreeNode(10);
//		head.left = new TreeNode(20);
//		head.right = new TreeNode(30);
//		head.right.left = new TreeNode(90);
//		head.right.right = new TreeNode(100);
//		head.right.right.left = new TreeNode(110);
//		head.right.right.right = new TreeNode(120);
//		head.left.left = new TreeNode(40);
//		head.left.right = new TreeNode(50);
//		head.left.left.left = new TreeNode(60);
//		head.left.left.right = new TreeNode(70);
//		
//		bstToCircularDDl(head);
//	}
//}
//

// Insertion in BST
// Iterative and recursion
//class Solution
//{
//	TreeNode root = null;
//	
//	void insertBst(int val)
//	{
//		root = insert(root, val);
//	}
//	
//	
//	TreeNode insert(TreeNode root, int val)
//	{
//		if(root == null) 
//		{
//			root = new TreeNode(val);
//			return root;
//		}
//		
//		if(val >= root.val)
//			root.right = insert(root.right,val);
//		else root.left = insert(root.left,val);
//		
//		
//		return root;
//		
//	}
//	
//	
//	public static void main(String[] arsg)
//	{
////		head.left = new TreeNode(20);
////		head.right = new TreeNode(30);
////		head.right.left = new TreeNode(90);
////		head.right.right = new TreeNode(100);
////		head.right.right.left = new TreeNode(110);
////		head.right.right.right = new TreeNode(120);
////		head.left.left = new TreeNode(40);
////		head.left.right = new TreeNode(50);
////		head.left.left.left = new TreeNode(60);
////		head.left.left.right = new TreeNode(70);
//		Solution solution = new Solution();
//		solution.insertBst(55);
//		solution.insertBst(10);
//		solution.insertBst(20);
//		solution.insertBst(70);
//		solution.insertBst(110);
//		solution.insertBst(0);
//	}
//}


// Algo Expert River Size

//class Program {
//	  static void findAllRivers(int [][]matrix, boolean[][] visited, int row, int col, int[] size)
//	  {   
//	    int arr[] = new int[] {0,1,0,-1,0};
//	    for(int i = 0; i < arr.length - 1; i++)
//	      {
//	        int newi = row + arr[i];
//	        int newj = col + arr[i+1];
//	       if(newi < 0 || newj < 0 || newi >= matrix.length || newj >= matrix[0].length) continue;
//	        if(matrix[newi][newj] == 1 && !visited[newi][newj])
//	        {
//	          System.out.println(newi + " " + newj);
//	           size[0]++;
//	           visited[newi][newj] = true;
//	           findAllRivers(matrix, visited, newi, newj, size);          
//	        } 
//	      }
//	  
//	  }
//
//	  
//	  public static List<Integer> riverSizes(int[][] matrix) {
//	    int row = matrix.length;
//	    int col = matrix[0].length;
//	    boolean visited[][] = new boolean[row][col];
//	    ArrayList<Integer> list = new ArrayList<>();
//	    int size[] = new int[]{1};
//	    for(int i = 0; i < row; i++)
//	      {
//	        for(int j = 0; j < col; j++)
//	          {
//	            if(matrix[i][j] == 1 && !visited[i][j])
//	            {
//	             size = new int[]{1};
//	              visited[i][j] = true;
//	               findAllRivers(matrix, visited, i, j, size);
//	              list.add(size[0]);
//	            }             
//	          }
//	      }
//	  
//	    return list;
//	  }
//	}
//
//class Solution {
//	  static void findAllRivers(int [][]matrix, boolean[][] visited, int row, int col, int[] size)
//	  {   
//	    int arr[] = new int[] {0,1,0,-1,0};
//	    for(int i = 0; i < arr.length - 1; i++)
//	      {
//	        int newi = row + arr[i];
//	        int newj = col + arr[i+1];
//	       if(newi < 0 || newj < 0 || newi >= matrix.length || newj >= matrix[0].length) continue;
//	        if(matrix[newi][newj] == 1 && !visited[newi][newj])
//	        {
//	          System.out.println(newi + " " + newj);
//	           size[0]++;
//	           visited[newi][newj] = true;
//	           findAllRivers(matrix, visited, newi, newj, size);          
//	        } 
//	      }
//	  
//	  }
//
//	  
//	  public static List<Integer> riverSizes(int[][] matrix) {
//	    int row = matrix.length;
//	    int col = matrix[0].length;
//	    boolean visited[][] = new boolean[row][col];
//	    ArrayList<Integer> list = new ArrayList<>();
//	    int size[] = new int[]{1};
//	    for(int i = 0; i < row; i++)
//	      {
//	        for(int j = 0; j < col; j++)
//	          {
//	            if(matrix[i][j] == 1 && !visited[i][j])
//	            {
//	             size = new int[]{1};
//	              visited[i][j] = true;
//	               findAllRivers(matrix, visited, i, j, size);
//	              list.add(size[0]);
//	            }             
//	          }
//	      }
//	  
//	    return list;
//	  }
//	  
//	  public static void main(String[] args)
//	  {
//		  int matrix[][] = {{1,1,1,0,0,1,1,0,0,0,1}};
//		  riverSizes(matrix);
//	  }
//	}

//class Solution {
//
//  public static LinkedList reverse(LinkedList root, LinkedList pre)
//  {
//    if(root == null) return root;
//
//    LinkedList node = (root.next != null) ? reverse(root.next, root) : root;
//    root.next = pre;
//    return node;
//  }
//
//  
//  public static LinkedList shiftLinkedList(LinkedList head, int k) {
//    if(k < 0)
//      head = reverse(head, null);
//    LinkedList temp = head;
//    int cnt = 1;
//    while(temp.next != null)
//      {
//        cnt++;
//        temp = temp.next;
//      }
//
//    temp.next = head;
//    int t = Math.abs(k) % cnt;
//    int end = cnt - t;
//    while(end-- != 0) temp = temp.next;
//        head = temp.next;
//        temp.next = null;
//    return head;
//  }
//
//  static class LinkedList {
//    public int value;
//    public LinkedList next;
//
//    public LinkedList(int value) {
//      this.value = value;
//      next = null;
//    }
//  }
//  public static void main(String[] args)
//  {
//	  LinkedList head = new LinkedList(1);
//	  head.next = new LinkedList(2);
//	  head.next.next  = new LinkedList(3);
//	  head.next.next.next = new LinkedList(4);
//	  head.next.next.next.next = new LinkedList(5);
//	  head.next.next.next.next.next = new LinkedList(0);
//	  
//	  shiftLinkedList(head, -1);
//  }
//}

//class Solution {
//	  public static int maxProfitWithKTransactions(int[] prices, int k) {
//	    int length = prices.length;
//	    if(length == 0) return 0;
//	    int min = prices[0];
//	    int maxProfit = 0;  
//	    int finalProfit = 0;
//	    PriorityQueue<Integer> profitpq = new PriorityQueue<>((a,b) -> b - a);
////	    for(int i = 1; i < length && k > 0; i++)
////	    {
////	          if(prices[i] < min)
////	          {
////	        	  min = prices[i];
////	          }
////	        	 	        	  
////	           
////
////	          int profit = prices[i] - min;
////	          if(profit >= maxProfit)
////	            maxProfit= profit;
////	          else{
////	        	 
////	        	  finalProfit += maxProfit;
////	        	  min = prices[i];
////	        	  k--;
////	        	  maxProfit = 0;
////	          }
////	    }
//	    for(int i = 1; i < length; i++)
//	    {
//	          if(prices[i] < min)
//	            min = prices[i];
//
//	          int profit = prices[i] - min;
//	          if(profit >= maxProfit)
//              {
//                 maxProfit= profit;
//                  
//              }
//	          else {
//	        	  profitpq.offer(maxProfit);
//	        	  maxProfit = 0;
//	        	  min = prices[i];
//			}
//	    }
//	    profitpq.offer(maxProfit);
////	    if(k > 0)  finalProfit += maxProfit;
//	    while(!profitpq.isEmpty())
//	    	System.out.println(profitpq.poll());
//	    System.out.println(finalProfit);
//	    return finalProfit;
//	  }
//	  
//	  public static void main(String[] args)
//	  {
//		  maxProfitWithKTransactions(new int[] {1, 25, 24, 23, 12, 36, 14, 40, 31, 41, 5}, 2);
//	  }
//	}

//class Solution
//{
//	public static void main(String[] args)
//	{
////		List<List<Boolean>> build = new LinkedList<>();
////		build.add(new LinkedList<>(Arrays.asList(true, true, true, true, false, false)));
////		build.add(new LinkedList<>(Arrays.asList(true, true, true, true, true, false)));
////		build.add(new LinkedList<>(Arrays.asList(true, true, true, true, true, true, true, false, false)));
////		build.add(new LinkedList<>(Arrays.asList(true, true, false, false,false, false, false, false)));
////		build.add(new LinkedList<>(Arrays.asList(true, true, true, true,true, true, true, true,true, true, true, true, false)));
////		build.add(new LinkedList<>(Arrays.asList(true, false)));
////		
////		
////		float percentage = 0.0f;
////		int right = 0;
////		float res[] = new float[build.size()];
////		int pos = 0;
////		while(right < build.size())
////		{
////			int i = 0;
////			int t = 0, f = 0;
////			while(i < build.get(right).size())
////			{
////				if(build.get(right).get(i) == true)
////					t++;
////				else f++;
////				i++;
////			}
////			float p = ((float)t / (t + f)) * 100;
////			res[pos++] = p;
////			right++;
////		}
////		
////		int max = 0;
////		int temp = 1;
////		for(int i = 0; i < build.size(); i++)
////		{
////			if(i > 0 && res[i] < res[i - 1]) {
////				temp++;
////				max = Math.max(temp, max);
////			}
////			else temp = 1;
////		}
////		System.out.println(max);
////		
//		
//		int arr[] = new int[]{-1,-2,1,3,5,6,3,5};
//		int arr2[] = new int[] {-1,3,4,5,3,4,5};
//		int k = 1, l = 2;
//		int cnt = 0;
//		for(int i = 0; i < arr.length - 1; i++)
//		{
//			int sum1 = arr[i] - arr2[i] + k;
//			int sum2 = arr2[i + 1] - arr2[i + 1] + k;
//			if(sum1 <= sum2) {
//				//System.out.println(i);
//				cnt++;
//			} 
//		}
//		
//		System.out.println(cnt);
//		
//	}
//}


//class Node1 {
//    Node1 links[] = new Node1[26];
//    int cntEndWith = 0;
//    int cntPrefix = 0;
//
//    public Node1() {
//    }
//
//    boolean containsKey(char ch) {
//        return (links[ch - 'a'] != null);
//    }
//    Node1 get(char ch) {
//        return links[ch-'a'];
//    }
//    void put(char ch, Node1 Node1) {
//        links[ch-'a'] = Node1;
//
//    }
//    void increaseEnd() {
//        cntEndWith++;
//    }
//    void increasePrefix() {
//        cntPrefix++;
//    }
//    void deleteEnd() {
//        cntEndWith--;
//    }
//    void reducePrefix() {
//        cntPrefix--;
//    }
//    int getEnd() {
//        return cntEndWith;
//    }
//    int getPrefix() {
//        return cntPrefix;
//    }
//}
//class Trie {
//    private Node1 root;
//
//    //Initialize your data structure here
//
//    Trie() {
//        root = new Node1();
//    }
//
//
//    //Inserts a word into the trie
//
//    public void insert(String word) {
//        Node1 Node1 = root;
//        for(int i = 0;i<word.length();i++) {
//            if(!Node1.containsKey(word.charAt(i))) {
//                Node1.put(word.charAt(i), new Node1());
//            }
//            Node1 = Node1.get(word.charAt(i));
//            Node1.increasePrefix();
//        }
//        Node1.increaseEnd();
//    }
//
//    public int countWordsStartingWith(String word) {
//        Node1 Node1 = root;
//        for(int i = 0;i<word.length();i++) {
//            if(Node1.containsKey(word.charAt(i))) {
//                Node1 = Node1.get(word.charAt(i));
//            }
//            else {
//                return 0;
//            }
//        }
//        return Node1.getPrefix();
//    }
//    public static void main(String args[]) {
//        String s[] = new String[2];
//        Trie T=new Trie();
//        s[0] = "aab";
//        s[1] = "aac";
//        int length = s.length;
//        String prefix[][] = new String[length + 1][length + 1];
//        for(int i = 0; i < s.length; i++)
//        {
//            T.insert(s[i]);
//        }
//
//
//        for(int i = 0; i < s.length; i++)
//        {
//            String str = s[i];
//            for(int j  = 0; j < str.length(); j++)
//            {
//                prefix[i][j] = str.substring(0, j + 1);
//            }
//            int sum = 0;
//            for(String str1: prefix[i])
//            {
//                sum += T.countWordsStartingWith(str1);
//            }
//
//            System.out.println(sum);
//        }
//    }
//
//}

//class Solution {
//    static int ans = 0;
//    static TreeNode evaluate(TreeNode root)
//    {
//        if(root == null)
//            return null;
//        TreeNode left = evaluate(root.left);
//        TreeNode right = evaluate(root.right);
//        
//        if(left != null && right != null)
//        {
//            if(root.val == 2 && (left.val == 1 || right.val == 1))
//            {
//                ans = 1;
//            }
//            else if(root.val == 3 && (left.val == 1 && right.val == 1))
//            {
//                ans = 1;
//            }
//            else 
//            	ans = 0;
//        }
//        return root;
//        
//    }
//    
//   public static boolean evaluateTree(TreeNode root) {
//       evaluate(root);
//       if(ans == 1) return true;
//       else return false;
//   }
//   
//   public static void main(String[] args)
//   {
//	   TreeNode rooTreeNode = new TreeNode(2);
//	   rooTreeNode.left = new TreeNode(1);
//	   rooTreeNode.right = new TreeNode(3);
//	   rooTreeNode.right.left = new TreeNode(0);
//	   rooTreeNode.right.right = new TreeNode(1);
//	   evaluateTree(rooTreeNode);
//	   
//   }
//}

//class Solution {
//    public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
//        Arrays.sort(buses);
//        Arrays.sort(passengers);
//        int length1 = buses.length;
//         int length2 = passengers.length;
//        int i = 0;
//        int j = 0;
//        int total = 0;
//        Stack<Integer> stack = new Stack<>();
//        while(i < length1)
//        {
//            total = 0;
//            while(j < length2 && passengers[j] < buses[i] && total < capacity)
//            {
//                total++;
//                stack.push(passengers[j]);
//                j++;
//            }
//            i++;
//        }
//        System.out.println(stack.pop());
//        int n = stack.peek();
//        while(!stack.isEmpty() && stack.peek() == n)
//        {
//            n--;
//            stack.pop();
//        }
//        return n;
//    }
//    
//    public static void main(String[] args)
//    {
//    	latestTimeCatchTheBus(new int[] {10, 20 , 30}, new int[] {19,13,26,4,25,11,21},2);
//    }
//}

//contest
//class Solution {
//    public static int fillCups(int[] amount) {
//       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
//        
//        int length = amount.length;
//        for(int i = 0; i < length; i++)
//        {
//            if(amount[i] != 0) pq.offer(amount[i]);
//        }
//           
//        
//        int time = 0;
//        while(pq.size() > 1)
//        {
//            int n1 = pq.poll();
//            n1--;
//            int n2 = pq.poll();
//            n2--;
//            if(n1 > 0) pq.offer(n1);
//            if(n2 > 0) pq.offer(n2);
//            time++;
//        }
//        int n = Integer.MAX_VALUE;
//        while(n > 0){
//            n = pq.peek();
//            n--;
//            time++;
//        } 
//        return time;
//        
//    }
//    
//    public static void main(String[] args){
//    	fillCups(new int[] {3,1,0});
//    }
//}


////////////////////////////// Graph ////////////////////////////////////

// Build graph

//class Solution
//{
//	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v)
//	{
//		list.get(u).add(v);
//		list.get(v).add(u);
//	}
//	
//	
//	public static void main(String[] args)
//	{
//		// Method 1 - Matrix
//		int totalVertex = 5;
//		int graph[][] = new int[][] {{1,2},
//			{1,3},{1,4},{3,5},{2,3},{4,5},{2,4}};
//			
//			
//		int [][] graphMatrix = new int[totalVertex + 1][totalVertex + 1];
//		for(int i = 0; i < graph.length; i++)
//		{
//			graphMatrix[graph[i][0]][graph[i][1]] = 1;
//			graphMatrix[graph[i][1]][graph[i][0]] = 1;
//		}
//		
//		for(int i = 1; i < graphMatrix.length; i++)
//		{
//			for(int j = 0; j < graphMatrix[0].length; j++)
//			{
//				System.out.print(graphMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		
//		// Method 2
//		// Adjacency List
//		
//		ArrayList<ArrayList<Integer>> graphList = new ArrayList<>();		
//		for(int i = 0 ; i < totalVertex; i++)
//			graphList.add(new ArrayList<>());
//		
//		addEdge(graphList, 0, 1);
//		addEdge(graphList, 0, 2);
//		addEdge(graphList, 0, 4);
//		addEdge(graphList, 2, 4);
//		addEdge(graphList, 1, 2);
//		addEdge(graphList, 3, 4);
//		addEdge(graphList, 1, 3);
//		
//		for(int i = 0 ; i < graphList.size(); i++) {
//			System.out.print(i + "-> ");
//			for(int j = 0; j < graphList.get(i).size(); j++)
//			{
//				System.out.print(graphList.get(i).get(j) + " ");
//			}
//			System.out.println();
//		}
//		
//		//Method 3 - Map
//		
//		HashMap<Integer, List<Integer>> graphHashMap = new HashMap<>();
//		
//		for(int i = 0 ; i < graph.length; i++)
//		{
//			if(graphHashS.containsKey(graph[i][0]))
//				graphHashMap.get(graph[i][0]).add(graph[i][1]);
//			else {
//				graphHashMap.put(graph[i][0], new LinkedList<>());
//				graphHashMap.get(graph[i][0]).add(graph[i][1]);
//			}
//			
//			if(graphHashMap.containsKey(graph[i][1]))
//				graphHashMap.get(graph[i][1]).add(graph[i][0]);
//			else {
//				graphHashMap.put(graph[i][1], new LinkedList<>());
//				graphHashMap.get(graph[i][1]).add(graph[i][0]);
//			}
//		}
//		System.out.println(graphHashMap);
//	}
//}

// Traverse 
//BFS

class Solution
{
	static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v)
	{
		list.get(u).add(v);
		list.get(v).add(u);
	}

	public static void main(String[] args)
	{
		// Method 1 - Matrix
		int totalVertex = 7;
		int graph[][] = new int[][] {{1,2},
			{1,3},{1,4},{3,5},{2,3},{4,5},{2,4}};
	
		ArrayList<ArrayList<Integer>> graphList = new ArrayList<>();		
		for(int i = 0 ; i < totalVertex; i++)
			graphList.add(new ArrayList<>());
		
		addEdge(graphList, 0, 1);
		addEdge(graphList, 0, 2);
		addEdge(graphList, 0, 4);
		addEdge(graphList, 2, 4);
		addEdge(graphList, 1, 2);
		addEdge(graphList, 3, 4);
		addEdge(graphList, 1, 3);
		addEdge(graphList, 5, 6);
		
		for(int i = 0 ; i < graphList.size(); i++) {
			System.out.print(i + "-> ");
			for(int j = 0; j < graphList.get(i).size(); j++)
			{
				System.out.print(graphList.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
		// For only one component in graph
		// if multiple component then just add for loop
		
//		Queue<Integer> bfsQueue = new LinkedList<>();
//		bfsQueue.add(0);
//		boolean visited[] = new boolean[totalVertex];
//		visited[0] = true;
		
		Queue<Integer> bfsQueue = new LinkedList<>();		
		boolean visited[] = new boolean[totalVertex];
		for(int i = 0; i < totalVertex; i++)
		{
			if(!visited[i])
			{
				bfsQueue.add(i);
				visited[i] = true;
			
				
				while(!bfsQueue.isEmpty())
				{
					int element = bfsQueue.poll();
					System.out.print(element + " ");
					for(int e: graphList.get(element))
						if(!visited[e])
						{
							bfsQueue.add(e);
							visited[e] = true;
						}
							
				}
			}
		}
		
	}
}

// For multiple component in graph
//DFS
