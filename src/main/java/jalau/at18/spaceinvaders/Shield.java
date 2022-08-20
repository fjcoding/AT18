package jalau.at18.spaceinvaders;

public class Shield {
    private static final int MAX_COUNT_BLOCK = 10;
    private static final int[] POSITON_X_BLOCK = {8, 7, 7, 7, 8, 8, 7, 7, 7, 8};
    private static final int[] POSITON_Y_BLOCK = {1, 1, 2, 3, 3, 6, 6, 7, 8, 8};
    private Block[] blocks;

    public Shield() {
        blocks = new Block[MAX_COUNT_BLOCK];
        addBlocks();
    }

    private void addBlocks() {
        for (int iterator = 0; iterator < MAX_COUNT_BLOCK; iterator++) {
            blocks[iterator] = new Block();
        }
    }

    public boolean existBlockInPosition(int posX, int posY) {
        boolean exist = false;
        for (int iterator = 0; iterator < POSITON_X_BLOCK.length; iterator++) {
            if (POSITON_X_BLOCK[iterator] == posX && POSITON_Y_BLOCK[iterator] == posY) {
                exist = true;
            }
        }
        return exist;
    }

    public boolean impactBlock(int posX, int posY) {
        boolean canImpact = false;
        for (int iterator = 0; iterator < POSITON_X_BLOCK.length; iterator++) {
            if (POSITON_X_BLOCK[iterator] == posX && POSITON_Y_BLOCK[iterator] == posY) {
                blocks[iterator].impact();
                canImpact = true;
            }
        }
        return canImpact;
    }

    public char getCharacter(int posX, int posY) {
        char blockCharater = '*';
        for (int iterator = 0; iterator < POSITON_X_BLOCK.length; iterator++) {
            if (POSITON_X_BLOCK[iterator] == posX && POSITON_Y_BLOCK[iterator] == posY) {
                blockCharater = blocks[iterator].getCharacter();
            }
        }
        return blockCharater;
    }
}
