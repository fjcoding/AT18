package jalau.at18.spaceinvaders;

import java.util.ArrayList;
import java.util.List;

public class Shield {
    private static final int MAX_COUNT_BLOCK = 10;
    private static final int[] INITIAL_POSITION_X = {8, 7, 7, 7, 8, 8, 7, 7, 7, 8};
    private static final int[] INITIAL_POSITION_Y = {1, 1, 2, 3, 3, 6, 6, 7, 8, 8};
    private List<Integer> posXBlock;
    private List<Integer> posYBlock;
    private List<Block> blocks;

    public Shield() {
        blocks = new ArrayList<>();
        posXBlock = new ArrayList<>();
        posYBlock = new ArrayList<>();
        fillBlocks();
    }

    private void fillBlocks() {
        for (int iterator = 0; iterator < MAX_COUNT_BLOCK; iterator++) {
            blocks.add(new Block());
            posXBlock.add(INITIAL_POSITION_X[iterator]);
            posYBlock.add(INITIAL_POSITION_Y[iterator]);
        }
    }

    public boolean existBlockInPosition(int posX, int posY) {
        boolean exist = false;
        for (int iterator = 0; iterator < posXBlock.size(); iterator++) {
            if (posXBlock.get(iterator) == posX && posYBlock.get(iterator) == posY) {
                exist = true;
            }
        }
        return exist;
    }

    public char impactBlock(int posX, int posY) {
        char charImpact = ' ';
        for (int iterator = 0; iterator < posXBlock.size(); iterator++) {
            if (posXBlock.get(iterator) == posX && posYBlock.get(iterator) == posY) {
                if(blocks.get(iterator).getCharacter() == '-') {
                    posXBlock.remove(iterator);
                    posYBlock.remove(iterator);
                    blocks.remove(iterator);
                }
                else{
                    Block block = blocks.remove(iterator);
                    block.impact();
                    blocks.add(iterator, block);
                    charImpact = blocks.get(iterator).getCharacter();
                }
            }
        }
        return charImpact;
    }

    public char getCharacter(int posX, int posY) {
        char value = ' ';
        for (int iterator = 0; iterator < posXBlock.size(); iterator++) {
            value = blocks.get(iterator).getCharacter();
        }
        return value;
    }
}
