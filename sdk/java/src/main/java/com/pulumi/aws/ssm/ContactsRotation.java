// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.ContactsRotationArgs;
import com.pulumi.aws.ssm.inputs.ContactsRotationState;
import com.pulumi.aws.ssm.outputs.ContactsRotationRecurrence;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.ContactsRotation;
 * import com.pulumi.aws.ssm.ContactsRotationArgs;
 * import com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ContactsRotation(&#34;example&#34;, ContactsRotationArgs.builder()        
 *             .contactIds(exampleAwsSsmcontactsContact.arn())
 *             .name(&#34;rotation&#34;)
 *             .recurrence(ContactsRotationRecurrenceArgs.builder()
 *                 .numberOfOnCalls(1)
 *                 .recurrenceMultiplier(1)
 *                 .dailySettings(ContactsRotationRecurrenceDailySettingArgs.builder()
 *                     .hourOfDay(9)
 *                     .minuteOfHour(0)
 *                     .build())
 *                 .build())
 *             .timeZoneId(&#34;Australia/Sydney&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Usage with Weekly Settings and Shift Coverages Fields
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.ContactsRotation;
 * import com.pulumi.aws.ssm.ContactsRotationArgs;
 * import com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ContactsRotation(&#34;example&#34;, ContactsRotationArgs.builder()        
 *             .contactIds(exampleAwsSsmcontactsContact.arn())
 *             .name(&#34;rotation&#34;)
 *             .recurrence(ContactsRotationRecurrenceArgs.builder()
 *                 .numberOfOnCalls(1)
 *                 .recurrenceMultiplier(1)
 *                 .weeklySettings(                
 *                     ContactsRotationRecurrenceWeeklySettingArgs.builder()
 *                         .dayOfWeek(&#34;WED&#34;)
 *                         .handOffTime(ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.builder()
 *                             .hourOfDay(4)
 *                             .minuteOfHour(25)
 *                             .build())
 *                         .build(),
 *                     ContactsRotationRecurrenceWeeklySettingArgs.builder()
 *                         .dayOfWeek(&#34;FRI&#34;)
 *                         .handOffTime(ContactsRotationRecurrenceWeeklySettingHandOffTimeArgs.builder()
 *                             .hourOfDay(15)
 *                             .minuteOfHour(57)
 *                             .build())
 *                         .build())
 *                 .shiftCoverages(ContactsRotationRecurrenceShiftCoverageArgs.builder()
 *                     .mapBlockKey(&#34;MON&#34;)
 *                     .coverageTimes(ContactsRotationRecurrenceShiftCoverageCoverageTimeArgs.builder()
 *                         .start(ContactsRotationRecurrenceShiftCoverageCoverageTimeStartArgs.builder()
 *                             .hourOfDay(1)
 *                             .minuteOfHour(0)
 *                             .build())
 *                         .end(ContactsRotationRecurrenceShiftCoverageCoverageTimeEndArgs.builder()
 *                             .hourOfDay(23)
 *                             .minuteOfHour(0)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .startTime(&#34;2023-07-20T02:21:49+00:00&#34;)
 *             .timeZoneId(&#34;Australia/Sydney&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;key1&#34;, &#34;tag1&#34;),
 *                 Map.entry(&#34;key2&#34;, &#34;tag2&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Usage with Monthly Settings Fields
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ssm.ContactsRotation;
 * import com.pulumi.aws.ssm.ContactsRotationArgs;
 * import com.pulumi.aws.ssm.inputs.ContactsRotationRecurrenceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new ContactsRotation(&#34;example&#34;, ContactsRotationArgs.builder()        
 *             .contactIds(exampleAwsSsmcontactsContact.arn())
 *             .name(&#34;rotation&#34;)
 *             .recurrence(ContactsRotationRecurrenceArgs.builder()
 *                 .numberOfOnCalls(1)
 *                 .recurrenceMultiplier(1)
 *                 .monthlySettings(                
 *                     ContactsRotationRecurrenceMonthlySettingArgs.builder()
 *                         .dayOfMonth(20)
 *                         .handOffTime(ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.builder()
 *                             .hourOfDay(8)
 *                             .minuteOfHour(0)
 *                             .build())
 *                         .build(),
 *                     ContactsRotationRecurrenceMonthlySettingArgs.builder()
 *                         .dayOfMonth(13)
 *                         .handOffTime(ContactsRotationRecurrenceMonthlySettingHandOffTimeArgs.builder()
 *                             .hourOfDay(12)
 *                             .minuteOfHour(34)
 *                             .build())
 *                         .build())
 *                 .build())
 *             .timeZoneId(&#34;Australia/Sydney&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeGuru Profiler Profiling Group using the `arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ssm/contactsRotation:ContactsRotation example arn:aws:ssm-contacts:us-east-1:012345678910:rotation/example
 * ```
 * 
 */
@ResourceType(type="aws:ssm/contactsRotation:ContactsRotation")
public class ContactsRotation extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the rotation.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the rotation.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Amazon Resource Names (ARNs) of the contacts to add to the rotation. The order in which you list the contacts is their shift order in the rotation schedule.
     * 
     */
    @Export(name="contactIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> contactIds;

    /**
     * @return Amazon Resource Names (ARNs) of the contacts to add to the rotation. The order in which you list the contacts is their shift order in the rotation schedule.
     * 
     */
    public Output<List<String>> contactIds() {
        return this.contactIds;
    }
    /**
     * The name for the rotation.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the rotation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `daily_settings`, `monthly_settings`, or `weekly_settings` must be populated. See Recurrence for more details.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="recurrence", refs={ContactsRotationRecurrence.class}, tree="[0]")
    private Output</* @Nullable */ ContactsRotationRecurrence> recurrence;

    /**
     * @return Information about when an on-call rotation is in effect and how long the rotation period lasts. Exactly one of either `daily_settings`, `monthly_settings`, or `weekly_settings` must be populated. See Recurrence for more details.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<Optional<ContactsRotationRecurrence>> recurrence() {
        return Codegen.optional(this.recurrence);
    }
    /**
     * The date and time, in RFC 3339 format, that the rotation goes into effect.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The date and time, in RFC 3339 format, that the rotation goes into effect.
     * 
     */
    public Output<Optional<String>> startTime() {
        return Codegen.optional(this.startTime);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format.
     * 
     */
    @Export(name="timeZoneId", refs={String.class}, tree="[0]")
    private Output<String> timeZoneId;

    /**
     * @return The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format.
     * 
     */
    public Output<String> timeZoneId() {
        return this.timeZoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactsRotation(String name) {
        this(name, ContactsRotationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactsRotation(String name, ContactsRotationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactsRotation(String name, ContactsRotationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/contactsRotation:ContactsRotation", name, args == null ? ContactsRotationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactsRotation(String name, Output<String> id, @Nullable ContactsRotationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/contactsRotation:ContactsRotation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ContactsRotation get(String name, Output<String> id, @Nullable ContactsRotationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContactsRotation(name, id, state, options);
    }
}
