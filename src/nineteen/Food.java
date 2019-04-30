package nineteen;

public interface Food {

	enum Appetizer implements Food{
		SALAD, SOUP, SRPING
	}

	enum MainCourse implements Food{
		LASAGNE,HUMMOUS,VINDALOO
	}

	enum Coffee implements Food{
		LATTE,TEA
	}

}
