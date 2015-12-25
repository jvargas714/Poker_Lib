package poker;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Combinations {
	
	protected static Set<Set<Integer>> myComboNoRep(List<Integer> lst, int choose, int outOf, 
			int offset, Set<Set<Integer>> result, int iteration) throws Exception{
		/*
		 * this is the current working one 
		 */
				
		if(choose == 0)
			return null;
		else if(outOf == 1)
			return result;
		else if(lst.size()%2 == 0)
			throw new Exception("@Combinations.ComboNoRep(): Cannot yet process lists that are even in size.");
				
		iteration++;
		
		if(offset >= outOf)
			offset = offset%outOf;
		//else
		
		System.out.println("Iteration#: " + iteration + "-----> result: " + result);
		System.out.println("Offset: " + offset);
		
		for(int i = 0; i <= lst.size()-1; i++){
			Set<Integer> tmp = new HashSet<Integer>();
			tmp.add(lst.get(i));
			
			for(int j = i + 1; tmp.size() <= choose; j+=offset){
				j%=outOf;
				tmp.add(lst.get(j));
				
				
				if (tmp.size() == choose){
					result.add(tmp);
					break;
				}
			}			
		}
		
		if(result.size() == totalPossibleCombosNoRep(choose, outOf))
			return result;
		else if(outOf % 2 == 0){			
			offset+=2;
		}else
			offset++;
		
		return myComboNoRep(lst, choose, outOf, offset, result, iteration);	
	}
	
	protected static <T> Set<Set<T>> comboNoRep(List<T> lst, int choose, int outOf, 
			int offset, Set<Set<T>> result, int iteration) throws Exception{
		/*
		 * This is the generic version of myComboNoRep works with Card objects! 
		 * the Card class implements the Comparable interface and can be compared
		 * using this method
		 */
		
		if(choose == 0)
			return null;
		else if(outOf == 1)
			return result;
		else if(lst.size()%2==0)
			throw new Exception("@Combinations.ComboNoRep(): "
					+ "Cannot yet process lists that are even in size.");
		
		iteration++;
		
		if(offset >= outOf)
			offset = offset%outOf;
		
		//System.out.println("Iteration#: " + iteration + "-----> result: " + result);
		//System.out.println("Offset: " + offset);
		
		for(int i = 0; i <= lst.size()-1; i++){
			Set<T> tmp = new HashSet<T>();
			tmp.add(lst.get(i));
			
			for(int j = i+1; tmp.size()<=choose; j+=offset){
				j%=outOf;
				tmp.add(lst.get(j));
				
				if(tmp.size() == choose){
					result.add(tmp);
					break;
				}
			}
		}
					
		if(result.size() == totalPossibleCombosNoRep(choose, outOf))
			return result;
		else if(outOf % 2 == 0)
			offset+=2;
		else
			offset++;
		
		return comboNoRep(lst, choose, outOf, offset, result, iteration);
	}
	
	protected static Set<Set<Object>> comboNoRep2(List<Object> lst, int choose, int outOf, 
			int offset, Set<Set<Object>> result, int iteration){
		
		
		return result;
		
	}

	protected static long factorial(int x){
		if(x==0)
			return 1;
		
		long result = x;
		for(int i = x-1; i>1; i--){
			result *= i;
		}
		
		return result;
		
	}
	
	protected static long totalPossibleCombosNoRep(int choose, int outOf){
		return (long)(factorial(outOf) / (factorial(choose) * factorial(outOf - choose)));

	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> lst = new ArrayList<Integer>();
		
		for(Integer x: a){
			lst.add(x);
		}		
		
		//System.out.println("total Poss: " + totalPossibleCombosNoRep(3, 15));
		//System.out.println("mod test: " + 15%7);
		
		long startTime = System.currentTimeMillis();
		
		try{
		Set<Set<Integer>> res = comboNoRep(lst, 5, 7, 1, new HashSet<Set<Integer>>(), 0);
		System.out.println("res size: " + res.size());
		System.out.println("res: " + res);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Elaspsed time: " + (System.currentTimeMillis() - startTime)/1000.000 + "\n\n\n");
		
		
		// comboNoRep using Cards
		ArrayList<Card> cards = new ArrayList<Card>(7);
		
		cards.add(new Card(2, 3));
		cards.add(new Card(4, 2));
		cards.add(new Card(3, 1));
		cards.add(new Card(7, 3));
		cards.add(new Card(9, 3));
		cards.add(new Card(8, 3));
		cards.add(new Card(11, 3));
		
		try {
			Set<Set<Card>> c = comboNoRep(cards, 5, 7, 1, new HashSet<Set<Card>>(), 0);
			System.out.println("Card combos length: " + c.size());
			System.out.println("Card combos: " + c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
				
	}

	
	
}
