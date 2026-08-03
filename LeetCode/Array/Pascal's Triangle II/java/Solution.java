class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first row

        for (int i = 1; i <= rowIndex; i++) {
            // update from the end to avoid overwriting
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // add last element
        }
        return row;
    }
}