// class Solution {
//     public String dayOfTheWeek(int day, int month, int year) {
//         StringBuilder date = new StringBuilder("");
//         if(day < 10) {
//             date.append('0');
//         }
//         date.append(day);
//         date.append('/');
//         if(month < 10) {
//             date.append('0');
//         }
//         date.append(month);
//         date.append('/');
//         date.append(year);
//         SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
//         Date requiredDate = inputFormat.parse(date.toString());
//         DateFormat  outputFormat = new SimpleDateFormat("EEEE");
//         return outputFormat.format(requiredDate);
//     }
// }

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
    }
    boolean isLeap(int y) {
    return y % 400 == 0 || (y % 100 != 0 && y % 4 == 0);
  }
}


class Solution {
public:
  
  string dayOfTheWeek(int day, int month, int year) {
    vector<int> md = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    vector<string> ds = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int tot = 3;
    for (int y = 1970; y < year; y++) {
      tot += isLeap(y)?366:365; 
    }
    for (int m = 1; m < month; m++) {
      if (isLeap(year) && m == 2) tot += 29;
      else tot += md[m];
    }
    tot += day;
    return ds[tot % 7];
  }
};