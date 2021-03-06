/**
 *   File Name: Accountant.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Oct 15, 2016
 *
 */

package com.sqa.lg.providers;

/**
 * Accountant //ADDD (description of class)
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
public class Physician extends MedicalPersonnel implements IProviders {

	/**
	 *
	 */
	public Physician() {

		super();
	}

	/**
	 * @param name
	 * @param energy
	 */
	public Physician(String name, int energy) {
		super(name, energy);
	}

	@Override
	public void performDuties() {
		super.performDuties();
		this.doWork(TypeOfWork.PHYSICIAN);
		// this.doWork(TypeOfWork.ADMINISTRATOR);
	}

}
