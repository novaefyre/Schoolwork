package guiPractice.WhackAMole;

import guiPractice.components.Action;
import guiPractice.components.Clickable;

public interface MoleInterface extends Clickable {

	double getAppearanceTime();

	void setAction(Action action);

	void setAppearanceTime(double d);
}