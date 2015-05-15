package pl.agh.edu.springtest.elements;

import pl.agh.edu.springtest.elements.IElement;

public class ElementHelper {

	IElement elementGenerator;

	public ElementHelper(IElement element) {
		setElementGenerator(element);
	}

	public String printMessage() {
		return elementGenerator.printMessage();
	}

	public void setElementGenerator(IElement elementGenerator) {
		this.elementGenerator = elementGenerator;
	}

}
