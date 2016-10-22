/**
 *   File Name: MedicalPersonnelTest.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Oct 21, 2016
 *
 */

package com.sqa.lg.providers;

import org.junit.*;

/**
 * MedicalPersonnelTest //ADDD (description of class)
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
public class MedicalPersonnelTest {

	/**
	 *
	 */

	@Test
	public void test() {
		IProviders[] providers = { new RNNurse("John", 150), new Technician("Steve", 50), new Physician(),
				new Assistant("Johnny", 200) };
		for (int i = 0; i < providers.length; i++) {
			providers[i].move((int) (Math.random() * 150));
			providers[i].performDuties();
			providers[i].move((int) (Math.random() * 50));
			providers[i].move((int) (Math.random() * 200));
			System.out.println(providers[i]);
		}
	}

}
