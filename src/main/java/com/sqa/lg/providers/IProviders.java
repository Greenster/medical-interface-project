/**
 *   File Name: IEmployee.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Oct 15, 2016
 *
 */

package com.sqa.lg.providers;

/**
 * IEmployee //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Green, Lorne
 * @version 1.0.0
 * @since 1.0
 *
 */
public interface IProviders {

	/**
	 * @return
	 */
	public int getEnergy();

	/**
	 * @param energy
	 */
	public void setEnergy(int energy);

	/**
	 * @return
	 */
	int calcSpeed();

	/**
	 * @param typeOfWork
	 * @return
	 */
	boolean doWork(TypeOfWork typeOfWork);

	/**
	 * @param steps
	 */
	void move(int steps);

	/**
	 *
	 */
	void performDuties();
}
