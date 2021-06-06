package com.company.blockchain;

import java.util.Arrays;

public class BlockchainExample {
    public static void main(String[] args){
        /**
         * Blockchain- consists of block which has hash of the previous block and + transactions
         * These blocks are chained together
         * if you modify the transaction in first block it gets modified in all the blocks, that is why we can not modify a single block in blockchain
         */
        Transaction transaction1 = new Transaction("Peter", "Sam", 900L);
        Transaction transaction2 = new Transaction("Sam", "Harry", 1900L);
        Transaction transaction3 = new Transaction("Sam", "Niall", 1000L);
        Transaction transaction4 = new Transaction("Niall", "Liam", 1080L);
        //printing hashcode
//        System.out.println(transaction1.hashCode());
//        System.out.println(transaction2.hashCode());
//        System.out.println(transaction3.hashCode());

        //first block won't have any hash function it won't have any prev block i.e- genesis block
        //block has the hash code (a digital signature) which is used in subsequent blocks
        Block firstBlock = new Block(0, Arrays.asList(transaction1, transaction2));
        System.out.println(firstBlock.hashCode());
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(transaction3));
        System.out.println(secondBlock.hashCode());
        Block thirdBlock = new Block(secondBlock.hashCode(), Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashCode());


    }
}
