/**
 *   File Name: .java<br>
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
public class MedicalPersonnel implements IProviders {

	private double avgSteps;

	private int energy = 100;
	private String name;
	private int totalSteps;
	private int totalStepSets;

	/**
	 *
	 */
	public MedicalPersonnel() {

		this.name = "John Doe";
		this.energy = 20;
	}

	/**
	 * @param name
	 * @param energy
	 */
	public MedicalPersonnel(String name, int energy) {
		super();
		this.name = name;
		this.energy = energy;
	}

	@Override
	public int calcSpeed() {
		this.avgSteps = this.totalSteps / this.totalStepSets;
		int speed = (int) (this.avgSteps * this.energy * 3);

		return speed;
	}

	@Override
	public boolean doWork(TypeOfWork typeOfWork) {
		switch (typeOfWork) {
		case TECHNICIAN:
			System.out.println(this.getName() + " does a lot of heavy lifting.");
			setEnergy(getEnergy() - 4);
			break;
		case ADMINISTRATOR:
			System.out.println(this.getName() + " shuffles through continuous paper work.");
			setEnergy(getEnergy() - 1);
			break;
		case MANAGER:
			System.out.println(this.getName() + " watches closely over his employees.");
			setEnergy(getEnergy() - 2);
			break;
		case NURSE:
			System.out.println(this.getName() + " ponders and analyzes most important aspects.");
			setEnergy(getEnergy() - 3);
			break;
		case CUSTODIAN:
			System.out.println(this.getName() + " responsible for daily upkeep of the facility.");
			setEnergy(getEnergy() - 4);
			break;
		case PHYSICIAN:
			System.out.println(this.getName() + " diagnose ailments and prescribes medication for sick.");
			setEnergy(getEnergy() - 2);
			break;
		case ACCOUNTANT:
			System.out.println(this.getName() + " responsible for tax records and business expenses.");
			setEnergy(getEnergy() - 1);
			break;
		case ASSISTANT:
			System.out.println(this.getName() + " assist with regular office and clerical needs.");
			setEnergy(getEnergy() - 4);
			break;
		default:
			break;
		}

		return true;
	}

	/**
	 * @return the energy
	 */
	@Override
	public int getEnergy() {
		return this.energy;
	}

	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @see com.sqa.lg.providers.IProviders#move(int)
	 */
	@Override
	public void move(int steps) {
		System.out.println("The " + getClass().getSimpleName().toLowerCase() + ", " + this.getName() + " moves forward "
				+ steps + " steps.");
		this.totalSteps += steps;
		this.totalStepSets += 1;
	}

	/**
	 * @see com.sqa.lg.providers.IProviders#performDuties()
	 */
	@Override
	public void performDuties() {
		// this.doWork(TypeOfWork.ADMINISTRATOR);
		// this.doWork(TypeOfWork.PHYSICIAN);
	}

	/**
	 * @param energy
	 *            the energy to set
	 */
	@Override
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int speed = calcSpeed();
		StringBuilder builder = new StringBuilder();
		builder.append(calcSpeed());
		builder.append("The ");
		builder.append(this.getClass().getSimpleName());
		builder.append(", ");
		builder.append(this.name);
		builder.append(", currently has an energy rating of ");
		builder.append(this.energy);
		builder.append(", averaging about ");
		builder.append(this.avgSteps);
		builder.append(" steps between duties.\n His speed can be denoted by a numeric value of ");
		builder.append(speed);
		builder.append(".");
		return builder.toString();
	}

	/**
	 *
	 */

	/**
	 *
	 */
}
