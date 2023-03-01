package andre;

public class caixa {
	
	private int width;
    private int height;
    private static char character;
    
    public caixa(int widthParam, int heightParam) {
    	this(widthParam, heightParam, '*');

    }

    public caixa(int widthParam, int heightParam, char characterParam) {
    	
        width = widthParam;
        height = heightParam;
        character = characterParam;
    }

    public void print() {
        if (width < 4) {
            width = 4;
        }
        if (width < 4) {
            width = 4;
        }
        printTopOrButtom(width);
        printLeftAndRight(width, height - 2);
        printTopOrButtom(width);
    }

    private static void printTopOrButtom(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    private static void printLeftAndRight(int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(character);
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(character);
        }
    }
}
