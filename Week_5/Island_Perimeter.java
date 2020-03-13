public class Island_Perimeter {
    public static void main(String[] args) {

    }

    public int islandPerimeter(int[][] grid) {
        boolean[][] whereBeen = new boolean[grid.length][];
        for (int i = 0; i < whereBeen.length; i++)
            whereBeen[i] = new boolean[grid[i].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int temp = sizeOfIsland(grid, whereBeen, i, j);
                if (temp > max)
                    max = temp;
            }
            System.out.println("=========");
        }
        return max;
    }

    public int sizeOfIsland(int[][] grid, boolean[][] whereBeen, int verLocation, int horLocation) {

        if (verLocation >= grid.length || verLocation < 0)
            return 0;
        if (horLocation >= grid[verLocation].length || horLocation < 0)
            return 0;
        if (whereBeen[verLocation][horLocation])
            return 0;
        if (grid[verLocation][horLocation] == 1) {
            whereBeen[verLocation][horLocation] = true;
            int edges = 0;
            int temp1 = sizeOfIsland(grid, whereBeen, verLocation + 1, horLocation);
            if (temp1 == 0)
                edges++;
            int temp2 = sizeOfIsland(grid, whereBeen, verLocation, horLocation + 1);
            if (temp2 == 0)
                edges++;
            int temp3 = sizeOfIsland(grid, whereBeen, verLocation - 1, horLocation);
            if (temp3 == 0) {
                edges++;
            }
            int temp4 = sizeOfIsland(grid, whereBeen, verLocation, horLocation - 1);
            if (temp4 == 0)
                edges++;
            System.out.printf("(%d, %d) = %d\n", verLocation, horLocation, (edges + temp1 + temp2 + temp3 + temp4));
            return edges + temp1 + temp2 + temp3 + temp4;
        } else {
            return 0;
        }

    }
}