const express = require('express');
const Questions = require('../../models/Questions');

const router = express.Router();

router.get('/:id', async (req, res) => {
    try {
        const post = await Questions.findById(req.params.id);
        if (!post) {
            throw Error('No Items') 
        }
        res.status(200).json(post);
    } catch (err) {
            res.status(400).json({ msg: err})
    }  
});

router.post('/', async (req, res) => {
    // res.send("Let's create posts!")
    // console.log(req.body);
    const new_Posts = new Posts(req.body);

    try {
        const post = await new_Posts.save();
        if (!post) {
            throw Error('Something went wrong while saving the post');
        }
            res.status(200).json(post);
    } catch(err) {
        res.status(400).json({ msg: err })
    }
});

router.delete('/:id', async (req, res) => {
    try {
        const post = await Posts.findByIdAndDelete(req.params.id);
        if (!post){
            throw Error('No post found!');
        }
        res.status(200).json({ success: true })
    } catch(err) {
        res.status(400).json({ msg: err })
    }
})

router.patch('/:id', async (req, res) => {
    try {
        const post = await Posts.findByIdAndUpdate(req.params.id, req.body);
        if (!post) {
            throw Error('Saomthing went wrong while updating the post!');
        }
        res.status(200).json({ success: true });
    } catch(err) {
        res.status(400).json({ msg: err })
    }
})

module.exports = router;