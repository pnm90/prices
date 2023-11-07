package com.pnm.prices.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PricesException extends RuntimeException {

	private static final long serialVersionUID = 8398360787826331742L;

	//	@NonNull private final PecunpayAutorizadorResponseCode errorInfo;
	private final String message;
}
