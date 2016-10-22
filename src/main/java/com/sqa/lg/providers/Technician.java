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
public class Technician extends MedicalPersonnel implements IProviders {

	public Technician() {

		super();
	}

	/**
	 * @param name
	 * @param energy
	 */
	public Technician(String name, int energy) {
		super(name, energy);
	}

	@Override
	public void performDuties() {
		super.performDuties();
		this.doWork(TypeOfWork.TECHNICIAN);
		// this.doWork(TypeOfWork.TECHNICIAN);
	}

}
