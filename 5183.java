class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        StringBuilder date = new StringBuilder("");
        if(day < 10) {
            date.append('0');
        }
        date.append(day);
        date.append('/');
        if(month < 10) {
            date.append('0');
        }
        date.append(month);
        date.append('/');
        date.append(year);
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date requiredDate = inputFormat.parse(date.toString());
        DateFormat  outputFormat = new SimpleDateFormat("EEEE");
        return outputFormat.format(requiredDate);
    }
}