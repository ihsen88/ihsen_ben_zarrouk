import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.util.*;


public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	//belongs to the matrix
	public static boolean Valid(ArrayList<Integer>   tab){
		
		
		 for(Integer elem: tab)
	       {
	       	if(tab.get(elem)==-1) return false;
	       }
		
		
		 return true;
		
		
		
	}
	
	//move North
	
	
	public static ArrayList<Integer> North(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		int dep=x-1;
		if((dep>0)&&(dep<3))
		res.add(dep);
		else
			res.add(-1);
		res.add(y);
		return res;
		
	}
	//move East
	public static ArrayList<Integer> East(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(x);
		int dep=y-1;
		if((dep>0)&&(dep<3))
		res.add(dep);
		else
			res.add(-1);
		
		return res;
		
	}
	//move South
	public static ArrayList<Integer> South(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		int dep=x+1;
		if(dep<3)
		res.add(dep);
		else
			res.add(-1);
		res.add(y);
		return res;
		
	}
	//move west
	public static ArrayList<Integer> West(int x, int y){
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(x);
		int dep=y+1;
		if(dep<3)
		res.add(dep);
		else
			res.add(-1);
		
		return res;
		
	}
	

	public static void main(String[] args) {
		// maze
		int starting_position_x=-1;
		int starting_position_y=-1;
		
		int  new_position_x;
		
		int  new_position_y;
		
		char matrice [][]= {{'#', '#', '#'}, 
				{'@', '.', '.'}, 
				{'#', '#', 'x'}}; 
				for(int i=0; i<3; i++){ 
				for(int j = 0; j < 3; j++){ 
				System.out.println(matrice[i][j]); 
				} 
				} 
				
				
				//find starting position
				
				for(int i=0; i<3; i++){ 
					for(int j = 0; j < 3; j++){ 
						
						if(matrice[i][j]=='@') {
							starting_position_x=i;
							starting_position_y=j;
						}
						
						  
					}}
				System.out.println("starting_position_x   "+starting_position_x);
				System.out.println("starting_position_y    "+starting_position_y);
				
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("choose your trip  ******* move North enter  N \n ******    move South enter D \n ******    move East enter E \n ******    move West enter w  ");
				
				String str = sc.nextLine();
				System.out.println("You typed: " + str);

				if(str.equals("N")==true){
				
				ArrayList<Integer> res=North(starting_position_x, starting_position_y);
				if(Valid(res)==true){
					
					
					new_position_x=res.get(0);
					
					new_position_y=res.get(1);
					
					
				}
				
				
				
				
				}
				if(str.equals("S")==true){
					
					ArrayList<Integer> res=South(starting_position_x, starting_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						
						
					}
					
					
					
					
					}
				if(str.equals("E")==true){
					
					ArrayList<Integer> res=East(starting_position_x, starting_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						
						
					}
					
					
					
					
					}
				if(str.equals("W")==true){
					
					ArrayList<Integer> res=West(starting_position_x, starting_position_y);
					if(Valid(res)==true){
						
						
						new_position_x=res.get(0);
						
						new_position_y=res.get(1);
						
						
					}
					
					
					
					
					}
				
				
				
				
	}

}
