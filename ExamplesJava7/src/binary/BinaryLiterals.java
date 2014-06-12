package binary;

public class BinaryLiterals {

	/**
	 * 128 64 32 16 8 4 2 1	 ---------------------------------------------------
	 *  1   1  1  1 1 1 1 1	 ---------------------------------------------------
	 *  
	 *  Ex. Get 76			 ---------------------------------------------------
	 *     64    +  8+4 	=  76  ---------------------------------------------
	 *  0   1  0  0 1 1 0 0	 ---------------------------------------------------
	 *  
	 * */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryLiterals bl = new BinaryLiterals();
		bl.binaryStuff();

	}
	
	private void binaryStuff(){
		
		// An 8-bit 'byte' value: 33
		byte aByte = (byte)0b00100001;

		System.out.println("0b00100001 = " + aByte);
		
		/*
		 * When more than 16 bits are included for a short variable these are ignored
		 * since a short can hold just 16 bits
		 * 
		 * */
		// A 16-bit 'short' value: (16-bit signed two's complement integer)
		short aShort = (short)0b1010000101000101;
		
		int anIntValue = (int)0b1010000101000101;
		
		//Short binary representation, notice it's negative
		System.out.println("0b1010000101000101 = " + aShort);
		
		//Same previous binary representation as short, value changes...
		System.out.println("0b1010000101000101 = " + anIntValue);
		// Some 32-bit 'int' values:
		int anInt1 = 0b10100001010001011010000101000101;
		int anInt2 = 0b101; // 5
		int anInt3 = 0B101; // The B can be upper or lower case.

		System.out.println("0b10100001010001011010000101000101 = " + anInt1);
		System.out.println("0b101 = " + anInt2);
		System.out.println("0B101 = " + anInt3);
		
		// A 64-bit 'long' value. Note the "L" suffix:
		long aLong = 0b1010000101000101101000010100010110100001010001011010000101000101L;
		
		System.out.println("0b1010000101000101101000010100010110100001010001011010000101000101L = " + aLong);
		
		System.out.println(decodeInstruction(0b00010000));
		System.out.println(decodeInstruction(0b00100000));
		System.out.println(decodeInstruction(0b01110000));
		System.out.println(decodeInstruction(48));
		System.out.println(decodeInstruction(64));
		System.out.println(decodeInstruction(80));
		System.out.println(decodeInstruction(96));
	}

	
	public int decodeInstruction(int instruction) {

		    switch (instruction & 0b11110000) {
		      case 0b00000000: return 0;
		      case 0b00010000: return 16;
		      case 0b00100000: return 32;
		      case 0b00110000: return 48;
		      case 0b01000000: return 64;
		      case 0b01010000: return 80;
		      case 0b01100000: return 96;
		      case 0b01110000: return 112;
		      default: throw new IllegalArgumentException();
		    }
		  
		}
	/*
	
	public State decodeInstruction(int instruction, State state) {
		  if ((instruction & 0b11100000) == 0b00000000) {
		    final int register = instruction & 0b00001111;
		    switch (instruction & 0b11110000) {
		      case 0b00000000: return state.nop();
		      case 0b00010000: return state.copyAccumTo(register);
		      case 0b00100000: return state.addToAccum(register);
		      case 0b00110000: return state.subFromAccum(register);
		      case 0b01000000: return state.multiplyAccumBy(register);
		      case 0b01010000: return state.divideAccumBy(register);
		      case 0b01100000: return state.setAccumFrom(register);
		      case 0b01110000: return state.returnFromCall();
		      default: throw new IllegalArgumentException();
		    }
		  } else {
		    final int address = instruction & 0b00011111;
		    switch (instruction & 0b11100000) {
		      case 0b00100000: return state.jumpTo(address);
		      case 0b01000000: return state.jumpIfAccumZeroTo(address);
		      //case 0b01000000: return state.jumpIfAccumNonzeroTo(address);
		      case 0b01100000: return state.setAccumFromMemory(address);
		      case 0b10100000: return state.writeAccumToMemory(address);
		      case 0b11000000: return state.callTo(address);
		      default: throw new IllegalArgumentException();
		    }
		  }
		}
	*/
}
