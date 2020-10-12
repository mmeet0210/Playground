#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f", fahrenheit(celsius));
    printf("\ntemperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	float f=(celsius*9/5)+32;
  return f;
}
float kelvin(float celsius)
{
	return (273.15+celsius);
}
