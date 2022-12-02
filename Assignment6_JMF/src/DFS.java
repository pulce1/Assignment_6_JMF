/**
 * This Class is the class used in the application to use recursion to traverse a tree, printing each step
 * @author James Frayser
 * @version 12/1/2022
 */
public class DFS 
{

	/**
	 * Methods for the root, travel distance, and height of the tree
	 */
	Node root;
	int travel=0;
	int height=0;
	
	public void DepthFirstSearch() 
	{
		
		System.out.println("Call DFS with the root node to do a Depth First Search.");
	}
	
	/**
	 * 
	 * @param node tells which node is about to be traversed
	 * @param level tells what level of nodes you are on
	 */
	public void DFS(Node node, int level) 
	{
		
		System.out.println(node.getData());
	
		/**
		 * as node is not null, height becomes the level and the travel increases, marking distance in app
		 */
		if(node != null)
		{
			height=level;
			travel++;
			System.out.println("Nodes Traveled: " + travel);
		}
		
		/**
		 * @return the left node, As long as it is there and increases the level
		 */
		if(node.getlChild()!=null) 
		{
			DFS(node.getlChild() ,level+1);
		}
		
		/**
		 * @return the left node, As long as it is there and increases the level
		 */
		if(node.getrChild()!=null) 
		{
			DFS(node.getrChild(), level+1);
		}
		
	
		
	}

}