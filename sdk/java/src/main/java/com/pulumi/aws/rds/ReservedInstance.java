// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ReservedInstanceArgs;
import com.pulumi.aws.rds.inputs.ReservedInstanceState;
import com.pulumi.aws.rds.outputs.ReservedInstanceRecurringCharge;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an RDS DB Reserved Instance.
 * 
 * &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offering_id` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [RDS Reserved Instances Documentation](https://aws.amazon.com/rds/reserved-instances/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PurchaseReservedDBInstancesOffering.html).
 * 
 * &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.RdsFunctions;
 * import com.pulumi.aws.rds.inputs.GetReservedInstanceOfferingArgs;
 * import com.pulumi.aws.rds.ReservedInstance;
 * import com.pulumi.aws.rds.ReservedInstanceArgs;
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
 *         final var test = RdsFunctions.getReservedInstanceOffering(GetReservedInstanceOfferingArgs.builder()
 *             .dbInstanceClass(&#34;db.t2.micro&#34;)
 *             .duration(31536000)
 *             .multiAz(false)
 *             .offeringType(&#34;All Upfront&#34;)
 *             .productDescription(&#34;mysql&#34;)
 *             .build());
 * 
 *         var example = new ReservedInstance(&#34;example&#34;, ReservedInstanceArgs.builder()        
 *             .offeringId(test.applyValue(getReservedInstanceOfferingResult -&gt; getReservedInstanceOfferingResult.offeringId()))
 *             .reservationId(&#34;optionalCustomReservationID&#34;)
 *             .instanceCount(3)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import RDS DB Instance Reservations using the `instance_id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/reservedInstance:ReservedInstance reservation_instance CustomReservationID
 * ```
 * 
 */
@ResourceType(type="aws:rds/reservedInstance:ReservedInstance")
public class ReservedInstance extends com.pulumi.resources.CustomResource {
    /**
     * ARN for the reserved DB instance.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN for the reserved DB instance.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Currency code for the reserved DB instance.
     * 
     */
    @Export(name="currencyCode", refs={String.class}, tree="[0]")
    private Output<String> currencyCode;

    /**
     * @return Currency code for the reserved DB instance.
     * 
     */
    public Output<String> currencyCode() {
        return this.currencyCode;
    }
    /**
     * DB instance class for the reserved DB instance.
     * 
     */
    @Export(name="dbInstanceClass", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceClass;

    /**
     * @return DB instance class for the reserved DB instance.
     * 
     */
    public Output<String> dbInstanceClass() {
        return this.dbInstanceClass;
    }
    /**
     * Duration of the reservation in seconds.
     * 
     */
    @Export(name="duration", refs={Integer.class}, tree="[0]")
    private Output<Integer> duration;

    /**
     * @return Duration of the reservation in seconds.
     * 
     */
    public Output<Integer> duration() {
        return this.duration;
    }
    /**
     * Fixed price charged for this reserved DB instance.
     * 
     */
    @Export(name="fixedPrice", refs={Double.class}, tree="[0]")
    private Output<Double> fixedPrice;

    /**
     * @return Fixed price charged for this reserved DB instance.
     * 
     */
    public Output<Double> fixedPrice() {
        return this.fixedPrice;
    }
    /**
     * Number of instances to reserve. Default value is `1`.
     * 
     */
    @Export(name="instanceCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> instanceCount;

    /**
     * @return Number of instances to reserve. Default value is `1`.
     * 
     */
    public Output<Optional<Integer>> instanceCount() {
        return Codegen.optional(this.instanceCount);
    }
    /**
     * Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
     * 
     */
    @Export(name="leaseId", refs={String.class}, tree="[0]")
    private Output<String> leaseId;

    /**
     * @return Unique identifier for the lease associated with the reserved DB instance. Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance.
     * 
     */
    public Output<String> leaseId() {
        return this.leaseId;
    }
    /**
     * Whether the reservation applies to Multi-AZ deployments.
     * 
     */
    @Export(name="multiAz", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> multiAz;

    /**
     * @return Whether the reservation applies to Multi-AZ deployments.
     * 
     */
    public Output<Boolean> multiAz() {
        return this.multiAz;
    }
    /**
     * ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="offeringId", refs={String.class}, tree="[0]")
    private Output<String> offeringId;

    /**
     * @return ID of the Reserved DB instance offering to purchase. To determine an `offering_id`, see the `aws.rds.getReservedInstanceOffering` data source.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> offeringId() {
        return this.offeringId;
    }
    /**
     * Offering type of this reserved DB instance.
     * 
     */
    @Export(name="offeringType", refs={String.class}, tree="[0]")
    private Output<String> offeringType;

    /**
     * @return Offering type of this reserved DB instance.
     * 
     */
    public Output<String> offeringType() {
        return this.offeringType;
    }
    /**
     * Description of the reserved DB instance.
     * 
     */
    @Export(name="productDescription", refs={String.class}, tree="[0]")
    private Output<String> productDescription;

    /**
     * @return Description of the reserved DB instance.
     * 
     */
    public Output<String> productDescription() {
        return this.productDescription;
    }
    /**
     * Recurring price charged to run this reserved DB instance.
     * 
     */
    @Export(name="recurringCharges", refs={List.class,ReservedInstanceRecurringCharge.class}, tree="[0,1]")
    private Output<List<ReservedInstanceRecurringCharge>> recurringCharges;

    /**
     * @return Recurring price charged to run this reserved DB instance.
     * 
     */
    public Output<List<ReservedInstanceRecurringCharge>> recurringCharges() {
        return this.recurringCharges;
    }
    /**
     * Customer-specified identifier to track this reservation.
     * 
     */
    @Export(name="reservationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> reservationId;

    /**
     * @return Customer-specified identifier to track this reservation.
     * 
     */
    public Output<Optional<String>> reservationId() {
        return Codegen.optional(this.reservationId);
    }
    /**
     * Time the reservation started.
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return Time the reservation started.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * State of the reserved DB instance.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the reserved DB instance.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the DB reservation. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Hourly price charged for this reserved DB instance.
     * 
     */
    @Export(name="usagePrice", refs={Double.class}, tree="[0]")
    private Output<Double> usagePrice;

    /**
     * @return Hourly price charged for this reserved DB instance.
     * 
     */
    public Output<Double> usagePrice() {
        return this.usagePrice;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReservedInstance(String name) {
        this(name, ReservedInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReservedInstance(String name, ReservedInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReservedInstance(String name, ReservedInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/reservedInstance:ReservedInstance", name, args == null ? ReservedInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReservedInstance(String name, Output<String> id, @Nullable ReservedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/reservedInstance:ReservedInstance", name, state, makeResourceOptions(options, id));
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
    public static ReservedInstance get(String name, Output<String> id, @Nullable ReservedInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReservedInstance(name, id, state, options);
    }
}
