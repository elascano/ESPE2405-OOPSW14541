
    function sortNumbers() {
        const input = document.getElementById("numbers").value;
        const resultElement = document.getElementById("result");
    
        try {
            let data = input.split(",").map(Number);
    
            if (data.length <= 1) {
                resultElement.textContent = "Please enter more than one number.";
                return;
            }
    
            let strategy = null;
    
            if (data.length >= 2 && data.length <= 5) {
                strategy = new BubbleSort();
            } else if (data.length >= 6 && data.length <= 10) {
                strategy = new InsertionSort();
            } else if (data.length > 10) {
                strategy = new QuickSort();
            }
    
            const context = new SortContext(strategy);
            const sortedData = context.executeStrategy(data);
    
            resultElement.textContent = "Sorted Result: " + sortedData.join(", ");
    
        } catch (error) {
            resultElement.textContent = "Please enter valid integers separated by commas.";
        }
    }