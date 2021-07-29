import { Router } from 'express';
import AttemptsController from '@/controllers/AttemptsController';

const router = Router({ caseSensitive: true });

router.use(AttemptsController);

router.all('*', (req, res) => {
  res.status(400).json({
    url: req.url,
    message: 'Unauthorized Request',
  });
});

export default router;
