const os = 'Windows'; 
const factory = GUIFactory.getFactory(os);
const app = new ClientApp(factory);

app.createUI();