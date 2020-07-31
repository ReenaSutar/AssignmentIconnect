package datr;

public class Result1
{
 double Range1,Range2,Range3,Average;

public Result1(double range1, double range2, double range3, double average) {
	super();
	Range1 = range1;
	Range2 = range2;
	Range3 = range3;
	Average = average;
}

@Override
public String toString() {
	return "Result1 [Range1=" + Range1 + ", Range2=" + Range2 + ", Range3=" + Range3 + ", Average=" + Average + "]";
}
}
