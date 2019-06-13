/**
 * 
 * ISC License
 * 
 * Copyright (c) [2017], [Mike Sherwood]
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
 * OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 * 
 */

package com.mycompany.refreshfix;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Mike Sherwood
 */
@Named("index")
@ViewScoped
public class IndexBean implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static final Logger LOG = LoggerFactory.getLogger(IndexBean.class);
    
    private LocalDateTime time;
    
    @PostConstruct
    private void initialize() {
        time = LocalDateTime.now();
    }
    
    public void update() {
        time = LocalDateTime.now();
    }
    
    public LocalDateTime getTime() {
        LOG.debug("Returning {}", time);
        return time;
    }
}
