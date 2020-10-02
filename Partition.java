package partition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Partition {
	
	public List<List<Integer>> partitionMethode(List<Integer> listInt, int taille){
		List<List<Integer>> allList=new  ArrayList<List<Integer>>();
		for(int i=0;i<listInt.size();i+=taille) {
			allList.add(listInt.stream().skip(i).limit(taille).collect(Collectors.toList()));

		}
		
		return allList;
	}


}
