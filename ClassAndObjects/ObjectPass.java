package ClassAndObjects;

class PassObjRef {

	int a, b;

	public PassObjRef(int i, int j) {
		a = i;
		b = j;
	}

	// pass an object
	// Java always pass object (call-by-reference)
	// reference of an object stored in stack area.
	void meth(PassObjRef o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class ObjectPass{
	public static void main(String args[]) {
		PassObjRef ob = new PassObjRef(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}

}
