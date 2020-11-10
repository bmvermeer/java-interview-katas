package nl.brianvermeer.kata.excercises.encode;


import nl.brianvermeer.kata.NotImplementedYetException;

public class RunLengthEncoding {

            /** We hold most of our data on Kafka topics (think of these as big lists of messages).
             * For performance reasons we try to keep each message under a certain size (currently 1MB).
             * However, recently we've added a new data source that has a message size that breaks this limit.
             * This means we need to implement some form of data compression.
             *
             * After a bit of googling we've come across something we think might work: Run length encoding.
             * Your task is to implement the run-length encoding and decoding functions defined below.
             *
             * Some details about Run-length encoding:
             *
             * Run-length encoding (RLE) is a simple form of data compression,
             * where runs (consecutive data elements) are replaced by just one data value and count.
             *
             * For example we can represent the original 53 characters with only 13.
             *
             * "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"  ->  "12WB12W3B24WB"
             *
             * RLE allows the original data to be perfectly reconstructed from the compressed data,
             * which makes it a lossless data compression.
             *
             * "AABCCCDEEEE"  ->  "2AB3CD4E"  ->  "AABCCCDEEEE"

             * For simplicity, you can assume that the unencoded string will only contain the letters
             * A through Z (either lower or upper case) and whitespace.
             * This way data to be encoded will never contain any numbers and
             * numbers inside data to be decoded always represent the count for the following character.")
             **/


        public String encode(String string) {
            throw new NotImplementedYetException();
        }

        public String decode(String string) {
            throw new NotImplementedYetException();
        }



}
