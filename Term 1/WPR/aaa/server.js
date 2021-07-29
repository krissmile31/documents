const express = require('express');
// OCutry1iY1XIkHMj
const app = express();

app.get('/', (req, res) => {
    res.send('Hello from node');
});

const PORT = process.env.PORT || 3000;

app.listen(PORT, () => console.log(`Server run at port ${PORT}`));