package TI;



public enum PinMode {
    Input(0),
    Output(1),
    PWM(10),
    Unused(11);

    private final int value;
    private PinMode(int value)
    {
	this.value = value;
    }

    public int getValue()
    {
	return this.value;
    }
}