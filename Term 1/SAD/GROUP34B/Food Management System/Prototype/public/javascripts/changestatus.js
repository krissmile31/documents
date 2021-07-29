const changStatusDivList = [...document.getElementsByClassName('changeStatusBtn')];
const statusTextList = [...document.getElementsByClassName('orderStatus')];
for (let btnDiv of changStatusDivList) {
	btnDiv.onclick = e => {
		const orderID = e.target.id.slice(13);
		let xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (this.readyState === 4 && this.status === 200) {
				let result;
				eval('let result = ' + this.response);
				if (result.status === 'Cooking...') {
					document.
						getElementById('orderStatus-'+orderID).
						innerText = 'Order Status: Cooking...';
					e.target.innerText = 'Done';
				} else if (result.status === 'Done') {
					document.
						getElementById('orderStatus-'+orderID).
						innerText = 'Order Status: Done';
					e.target.classList.add('d-none');
				}
			}
		};
		xhr.open('POST', `/order/${orderID}/next-status`, true);
		xhr.send();
	};
}
for (let statusText of statusTextList) {
	const status = statusText.innerText.slice('Order Status: '.length);
	switch (status) {
	case 'Cooking...':
		statusText.classList.add('text-warning');
		break;
	case 'Done':
		statusText.classList.add('text-success');
		break;
	}
}