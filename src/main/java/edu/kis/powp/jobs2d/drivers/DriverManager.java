package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;

/**
 * Driver manager provides means to setup the driver. It also enables other
 * components and features of the application to react on configuration changes.
 */
public class DriverManager {

    private IVisitableDriver currentDriver;

    /**
     * @param driver Set the driver as current.
     */
    public synchronized void setCurrentDriver(IVisitableDriver driver) {
        currentDriver = driver;
    }

    /**
     * @return Current driver.
     */
    public synchronized IVisitableDriver getCurrentDriver() {
        return currentDriver;
    }
}
