/*
 * Title:        CloudSimSDN
 * Description:  SDN extension for CloudSim
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2015, The University of Melbourne, Australia
 */

package org.cloudbus.cloudsim.sdn.physicalcomponents.switches;


/**
 * Represent Gateway switch which connects between two separate NOS
 * 
 * @author Jungmin Son
 * @author Rodrigo N. Calheiros
 * @since CloudSimSDN 1.0
 */
public class GatewaySwitch extends Switch {

	public GatewaySwitch(String name,long bw, long iops, int upports, int downports) {
		super(name, bw, iops, upports, downports);
		//if (upports>0) throw new IllegalArgumentException("Core switches cannot have uplinks.");
	}

}