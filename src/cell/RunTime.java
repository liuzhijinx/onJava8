package cell;

import com.sun.javaws.IconUtil;

public class RunTime {

    public static void main(String[] args) {
        RunTime runTime = new RunTime();
        runTime.run();
    }

    public void run() {
        Integer[][] map = new Integer[101][101];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = 0;
            }
        }
        map[50][50] = 1;
//        printMap(map);

        for (int t = 0; t < 100000; t++) {
            map = updateMap(map);
        }
        printMap(map);
    }

    private Integer[][] updateMap(Integer[][] map) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    map[i][j]++;
                    count++;
                    if (map[i][j] > 9) {
                        map[i][j] = 0;
                    }
                }
            }
        }
        System.out.println(count);
        Integer[][] newMap = map.clone();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int coutNeighbour = 0;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    if (map[i-1][j-1] == 1) {
                        coutNeighbour++;
                    }
                }
                if (i - 1 >= 0) {
                    if (map[i-1][j] == 1) {
                        coutNeighbour++;
                    }
                }
                if (i - 1 >= 0 && j + 1 < map[i].length) {
                    if (map[i-1][j+1] == 1) {
                        coutNeighbour++;
                    }
                }
                if (j - 1 >= 0) {
                    if (map[i][j-1] == 1) {
                        coutNeighbour++;
                    }
                }
                if (j + 1 <map[i].length) {
                    if (map[i][j+1] == 1) {
                        coutNeighbour++;
                    }
                }
                if (i + 1 < map.length && j - 1 >= 0) {
                    if (map[i+1][j-1] == 1) {
                        coutNeighbour++;
                    }
                }
                if (i + 1 < map.length) {
                    if (map[i+1][j] == 1) {
                        coutNeighbour++;
                    }
                }
                if (i + 1 < map.length && j + 1 < map[i].length) {
                    if (map[i+1][j+1] == 1) {
                        coutNeighbour++;
                    }
                }

                if (coutNeighbour > 3) {
                    newMap[i][j] = 0;
                } else if (coutNeighbour < 1){
                    if (5 < map[i][j] && map[i][j] < 8) {
                        int a = (int)(Math.random() * 3) - 1;
                        int b = (int)(Math.random() * 3) - 1;
                        if (i+a >= 0 && i+a < map.length && j+b >= 0 && j+b < map.length) {
                            if (map[i+a][j+b] == 0) {
                                newMap[i+a][j+b] = 1;
                            }
                        }
                    }
                }
            }
        }

        return newMap;
    }

    private void printMap(Integer[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0) {
                    System.out.print("o");;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
