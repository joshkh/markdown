(ns editor.parser)

(def rules {"\n\n" {:style [:p]}
            "**" {:end "**" {:style [:span.bold]}} ;#"\*\*(.*?)\*\*"
            })