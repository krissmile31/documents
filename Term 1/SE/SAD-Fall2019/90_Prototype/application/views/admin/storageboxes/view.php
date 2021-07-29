<?php
defined('BASEPATH') or exit('No direct script access allowed');
?>

<div class="d-block mb-3 float-right">
    <a href="<?= base_url('admin/boxes-management/add'); ?>" class="btn btn-sm btn-primary">Add</a>
</div>
<table class="table table-hover">
    <thead>
        <th>ProductId</th>
        <th>BrandId</th>
        <th>Material</th>
        <th>Width</th>
        <th>Height</th>
        <th></th>
    </thead>
    <tbody>
        <?php foreach ($allStorageBoxes as $row) : ?>
            <tr>
                <td><?= $row->ProductId ?></td>
                <td><?= $row->Material ?></td>
                <td><?= $row->Width ?></td>
                <td><?= $row->Height ?></td>
                <td>
                    <a role="button" href="<?= base_url("admin/brands-management/edit/$row->Id") ?>" class="btn btn-sm btn-secondary">Edit</a>
                    <a role="button" href="<?= base_url("admin/brands-management/delete/$row->Id") ?>" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
        <?php endforeach; ?>
    </tbody>
</table>