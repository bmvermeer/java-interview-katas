package nl.brianvermeer.kata.solutions.highfive;

import java.util.*;

public class InitialSolution {

    public int[][] highFive(int[][] items){
        Map<Integer, List<Integer>> scoreBoard = new HashMap<>();


        for(int i = 0; i < items.length; i++){
            int id = items[i][0];
            int score = items[i][1];

            if (scoreBoard.get(id) == null) {
                List<Integer> scoreArray = new ArrayList<>();
                scoreArray.add(score);
                scoreBoard.put(id, scoreArray);
            } else {
                scoreBoard.get(id).add(score);
            }
        }

        List<int[]> resultList = new ArrayList<>();

        for(Map.Entry<Integer, List<Integer>> entry : scoreBoard.entrySet()){
            Integer id = entry.getKey();
            List<Integer> scoreArray = entry.getValue();

            Collections.sort(scoreArray);
            List<Integer> top5 = new ArrayList<>(scoreArray.subList(scoreArray.size() - 5, scoreArray.size()));
            int averageOfTop5 = top5.stream().mapToInt(Integer::intValue).sum() / 5;

            int[] result = new int[2];
            result[0] = id;
            result[1] = averageOfTop5;
            resultList.add(result);
        }

        int[][] results = new int[scoreBoard.size()][];
        return resultList.toArray(results);
    }

    public static void main(String[] args) {
        InitialSolution initialSolution = new InitialSolution();
        int[][] input = new int[][]{{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100}};
        initialSolution.highFive(input);
    }

}
