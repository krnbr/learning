package in.neuw.learning;

public class SO1Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree t1 = new Tree(5, new Tree(3, new Tree(20, null, null), new Tree(21, null, null)),
				new Tree(10, new Tree(1, null, null), null));

		Tree t2 = new Tree(8, new Tree(2, new Tree(8, null, null), new Tree(7, null, null)), new Tree(6, null, null));

		int length = new SO1Test2().solution(t1);
		System.out.println(length);
		length = new SO1Test2().solution(t2);
		System.out.println(length);

	}

	public int solution(Tree t) {
		return this.solution(t.x, t);
	}

	private int solution(int root, Tree t) {
		int h = 0;
		if (root <= t.x) {
			h++;
		}
		if (t.l != null) {
			h += solution(root, t.l);
		}
		if (t.r != null) {
			h += solution(root, t.r);
		}
		return h;
	}

	public static class Tree {
		public int x;
		public Tree l;
		public Tree r;


		public Tree(int x, Tree l, Tree r) {
			super();
			this.x = x;
			this.l = l;
			this.r = r;
		}

	}

}