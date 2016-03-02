/*
 * Copyright (C) 2009 Search Solution Corporation. All rights reserved by Search
 * Solution.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: -
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer. - Redistributions in binary
 * form must reproduce the above copyright notice, this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. - Neither the name of the <ORGANIZATION> nor the names
 * of its contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package com.cubrid.cubridmanager.core.broker.model;

import com.cubrid.cubridmanager.core.common.model.IModel;

/**
 * A class that extends IModel and can use BrokerInfoList
 * 
 * @author 2009-5-23
 */
public class BrokerInfos implements
		IModel {
	public static final String TASK_NAME = "getbrokersinfo";
	private String brokerstatus = null;
	private BrokerInfoList borkerInfoList = null;
	private String bname = "";

	public BrokerInfos() {
		borkerInfoList = new BrokerInfoList();
	}

	public String getTaskName() {
		return "getbrokersinfo";
	}

	public String getBrokerstatus() {
		return brokerstatus;
	}

	public void setBrokerstatus(String brokerstatus) {
		this.brokerstatus = brokerstatus;
	}

	public BrokerInfoList getBorkerInfoList() {
		return borkerInfoList;
	}

	/**
	 *Set a brokerInfoList
	 * 
	 * @param borkerInfoList BrokerInfoList
	 */
	public void addBrokersInfo(BrokerInfoList borkerInfoList) {
		this.borkerInfoList = borkerInfoList;
	}

	/**
	 * Get the broker name.
	 * 
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}

	/**
	 * Set the broker name.
	 * 
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}

}
