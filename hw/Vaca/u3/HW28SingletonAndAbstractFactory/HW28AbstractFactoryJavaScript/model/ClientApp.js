import Application from './Application.js';
import WinFactory from './WinFactory.js';
import LinuxFactory from './LinuxFactory.js';

function configureApplication() {
    let app;
    let factory;

    const osName = navigator.platform.toLowerCase();
    if (osName.includes('win')) {
        factory = new WinFactory();
    } else {
        factory = new LinuxFactory();
    }

    app = new Application(factory);
    return app;
}

const app = configureApplication();
app.paint();
