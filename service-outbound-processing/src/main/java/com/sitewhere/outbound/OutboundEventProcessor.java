/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.outbound;

import com.sitewhere.outbound.spi.IOutboundEventProcessor;
import com.sitewhere.server.lifecycle.TenantLifecycleComponent;
import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.device.event.IDeviceAlert;
import com.sitewhere.spi.device.event.IDeviceCommandInvocation;
import com.sitewhere.spi.device.event.IDeviceCommandResponse;
import com.sitewhere.spi.device.event.IDeviceLocation;
import com.sitewhere.spi.device.event.IDeviceMeasurements;
import com.sitewhere.spi.device.event.IDeviceStateChange;
import com.sitewhere.spi.server.lifecycle.LifecycleComponentType;

/**
 * Default implementation of {@link IOutboundEventProcessor}.
 * 
 * @author Derek
 */
public abstract class OutboundEventProcessor extends TenantLifecycleComponent implements IOutboundEventProcessor {

    /** Default number of threads used for processing */
    private static final int DEFAULT_NUM_PROCESSING_THREADS = 2;

    /** Unqiue processor id */
    private String processorId;

    /** Number of threads used for processing events */
    private int numProcessingThreads = DEFAULT_NUM_PROCESSING_THREADS;

    public OutboundEventProcessor() {
	super(LifecycleComponentType.OutboundEventProcessor);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#
     * onMeasurements (com.sitewhere.spi.device.event.IDeviceMeasurements)
     */
    @Override
    public void onMeasurements(IDeviceMeasurements measurements) throws SiteWhereException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#
     * onLocation(com .sitewhere.spi.device.event.IDeviceLocation)
     */
    @Override
    public void onLocation(IDeviceLocation location) throws SiteWhereException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#onAlert(
     * com. sitewhere .spi.device.event.IDeviceAlert)
     */
    @Override
    public void onAlert(IDeviceAlert alert) throws SiteWhereException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#
     * onCommandInvocation (com.sitewhere.spi.device.event.IDeviceCommandInvocation)
     */
    @Override
    public void onCommandInvocation(IDeviceCommandInvocation invocation) throws SiteWhereException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#
     * onCommandResponse (com.sitewhere.spi.device.event.IDeviceCommandResponse)
     */
    @Override
    public void onCommandResponse(IDeviceCommandResponse response) throws SiteWhereException {
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.device.event.processor.IOutboundEventProcessor#
     * onStateChange(com. sitewhere.spi.device.event.IDeviceStateChange)
     */
    @Override
    public void onStateChange(IDeviceStateChange state) throws SiteWhereException {
    }

    /*
     * @see com.sitewhere.outbound.spi.IOutboundEventProcessor#getProcessorId()
     */
    @Override
    public String getProcessorId() {
	return processorId;
    }

    public void setProcessorId(String processorId) {
	this.processorId = processorId;
    }

    /*
     * @see
     * com.sitewhere.outbound.spi.IOutboundEventProcessor#getNumProcessingThreads()
     */
    @Override
    public int getNumProcessingThreads() {
	return numProcessingThreads;
    }

    public void setNumProcessingThreads(int numProcessingThreads) {
	this.numProcessingThreads = numProcessingThreads;
    }
}