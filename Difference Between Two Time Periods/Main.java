#include<iostream>
using namespace std;
struct TIME {
    int seconds;
    int minutes;
    int hours;
}startTime, stopTime,diff;

void differenceBetweenTimePeriod(struct TIME t1, struct TIME t2, struct TIME *diff);

int main()
{
  cin>>startTime.hours>>startTime.minutes>>startTime.seconds;
  cin>>stopTime.hours>>stopTime.minutes>>stopTime.seconds;
  differenceBetweenTimePeriod(startTime, stopTime, &diff);
  cout<<diff.hours<<":"<<diff.minutes<<":"<<diff.seconds;
}
  void differenceBetweenTimePeriod(struct TIME start, struct TIME stop, struct TIME *diff) {
    if (stop.seconds > start.seconds) {
        --start.minutes;
        start.seconds += 60;
    }
    diff->seconds = start.seconds - stop.seconds;
    if (stop.minutes > start.minutes) {
        --start.hours;
        start.minutes += 60;
    }
    diff->minutes = start.minutes - stop.minutes;
    diff->hours = start.hours - stop.hours;
}
