public class TestArgs {
	public static void main(String [] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args [" + i + "] is: " + args[i]);
		}
	}
}

/* Comando a colocar en el CMD

CMD -> java TestArgs arg1 arg2 "another arg"

Repuesta:

args [0] is: arg1
args [1] is: arg2
args [2] is: another arg

*/