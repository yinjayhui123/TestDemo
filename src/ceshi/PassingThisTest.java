package ceshi;

/**
 * this方法的使用
 * @author Administrator
 *
 */
public class PassingThisTest {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.oneMehod();
	}

}

class Tree{
	public final int i ;
	
	public Tree(int i){
		this.i = i;
	}

	public Tree(){
		this(1);
	}
	
	public void oneMehod(){
		twoMehod(new Tree());
//		twoMehod(this);
	}
	
	public void twoMehod(Tree tree){
		final int b = 7;
		System.out.println("tree.i="+tree.i);
	}
	
}
