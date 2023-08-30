# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['PlanArgs', 'Plan']

@pulumi.input_type
class PlanArgs:
    def __init__(__self__, *,
                 contact_id: pulumi.Input[str],
                 stages: pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]):
        """
        The set of arguments for constructing a Plan resource.
        :param pulumi.Input[str] contact_id: The Amazon Resource Name (ARN) of the contact or escalation plan.
        :param pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]] stages: List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        pulumi.set(__self__, "contact_id", contact_id)
        pulumi.set(__self__, "stages", stages)

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the contact or escalation plan.
        """
        return pulumi.get(self, "contact_id")

    @contact_id.setter
    def contact_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "contact_id", value)

    @property
    @pulumi.getter
    def stages(self) -> pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]:
        """
        List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        return pulumi.get(self, "stages")

    @stages.setter
    def stages(self, value: pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]):
        pulumi.set(self, "stages", value)


@pulumi.input_type
class _PlanState:
    def __init__(__self__, *,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 stages: Optional[pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]] = None):
        """
        Input properties used for looking up and filtering Plan resources.
        :param pulumi.Input[str] contact_id: The Amazon Resource Name (ARN) of the contact or escalation plan.
        :param pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]] stages: List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        if contact_id is not None:
            pulumi.set(__self__, "contact_id", contact_id)
        if stages is not None:
            pulumi.set(__self__, "stages", stages)

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the contact or escalation plan.
        """
        return pulumi.get(self, "contact_id")

    @contact_id.setter
    def contact_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "contact_id", value)

    @property
    @pulumi.getter
    def stages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]]:
        """
        List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        return pulumi.get(self, "stages")

    @stages.setter
    def stages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PlanStageArgs']]]]):
        pulumi.set(self, "stages", value)


class Plan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PlanStageArgs']]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SSM Contact Plan.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssmcontacts.Plan("example",
            contact_id="arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias",
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=1,
            )])
        ```
        ### Usage with SSM Contact

        ```python
        import pulumi
        import pulumi_aws as aws

        contact = aws.ssmcontacts.Contact("contact",
            alias="alias",
            type="PERSONAL")
        plan = aws.ssmcontacts.Plan("plan",
            contact_id=contact.arn,
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=1,
            )])
        ```
        ### Usage With All Fields

        ```python
        import pulumi
        import pulumi_aws as aws

        escalation_plan = aws.ssmcontacts.Contact("escalationPlan",
            alias="escalation-plan-alias",
            type="ESCALATION")
        contact_one = aws.ssmcontacts.Contact("contactOne",
            alias="alias",
            type="PERSONAL")
        contact_two = aws.ssmcontacts.Contact("contactTwo",
            alias="alias",
            type="PERSONAL")
        test = aws.ssmcontacts.Plan("test",
            contact_id=escalation_plan.arn,
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=0,
                targets=[
                    aws.ssmcontacts.PlanStageTargetArgs(
                        contact_target_info=aws.ssmcontacts.PlanStageTargetContactTargetInfoArgs(
                            is_essential=False,
                            contact_id=contact_one.arn,
                        ),
                    ),
                    aws.ssmcontacts.PlanStageTargetArgs(
                        contact_target_info=aws.ssmcontacts.PlanStageTargetContactTargetInfoArgs(
                            is_essential=True,
                            contact_id=contact_two.arn,
                        ),
                    ),
                ],
            )])
        ```

        ## Import

        Using `pulumi import`, import SSM Contact Plan using the Contact ARN. For example:

        ```sh
         $ pulumi import aws:ssmcontacts/plan:Plan example {ARNValue}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_id: The Amazon Resource Name (ARN) of the contact or escalation plan.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PlanStageArgs']]]] stages: List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PlanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SSM Contact Plan.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ssmcontacts.Plan("example",
            contact_id="arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias",
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=1,
            )])
        ```
        ### Usage with SSM Contact

        ```python
        import pulumi
        import pulumi_aws as aws

        contact = aws.ssmcontacts.Contact("contact",
            alias="alias",
            type="PERSONAL")
        plan = aws.ssmcontacts.Plan("plan",
            contact_id=contact.arn,
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=1,
            )])
        ```
        ### Usage With All Fields

        ```python
        import pulumi
        import pulumi_aws as aws

        escalation_plan = aws.ssmcontacts.Contact("escalationPlan",
            alias="escalation-plan-alias",
            type="ESCALATION")
        contact_one = aws.ssmcontacts.Contact("contactOne",
            alias="alias",
            type="PERSONAL")
        contact_two = aws.ssmcontacts.Contact("contactTwo",
            alias="alias",
            type="PERSONAL")
        test = aws.ssmcontacts.Plan("test",
            contact_id=escalation_plan.arn,
            stages=[aws.ssmcontacts.PlanStageArgs(
                duration_in_minutes=0,
                targets=[
                    aws.ssmcontacts.PlanStageTargetArgs(
                        contact_target_info=aws.ssmcontacts.PlanStageTargetContactTargetInfoArgs(
                            is_essential=False,
                            contact_id=contact_one.arn,
                        ),
                    ),
                    aws.ssmcontacts.PlanStageTargetArgs(
                        contact_target_info=aws.ssmcontacts.PlanStageTargetContactTargetInfoArgs(
                            is_essential=True,
                            contact_id=contact_two.arn,
                        ),
                    ),
                ],
            )])
        ```

        ## Import

        Using `pulumi import`, import SSM Contact Plan using the Contact ARN. For example:

        ```sh
         $ pulumi import aws:ssmcontacts/plan:Plan example {ARNValue}
        ```

        :param str resource_name: The name of the resource.
        :param PlanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PlanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_id: Optional[pulumi.Input[str]] = None,
                 stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PlanStageArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PlanArgs.__new__(PlanArgs)

            if contact_id is None and not opts.urn:
                raise TypeError("Missing required property 'contact_id'")
            __props__.__dict__["contact_id"] = contact_id
            if stages is None and not opts.urn:
                raise TypeError("Missing required property 'stages'")
            __props__.__dict__["stages"] = stages
        super(Plan, __self__).__init__(
            'aws:ssmcontacts/plan:Plan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact_id: Optional[pulumi.Input[str]] = None,
            stages: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PlanStageArgs']]]]] = None) -> 'Plan':
        """
        Get an existing Plan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] contact_id: The Amazon Resource Name (ARN) of the contact or escalation plan.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PlanStageArgs']]]] stages: List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PlanState.__new__(_PlanState)

        __props__.__dict__["contact_id"] = contact_id
        __props__.__dict__["stages"] = stages
        return Plan(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contactId")
    def contact_id(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the contact or escalation plan.
        """
        return pulumi.get(self, "contact_id")

    @property
    @pulumi.getter
    def stages(self) -> pulumi.Output[Sequence['outputs.PlanStage']]:
        """
        List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
        """
        return pulumi.get(self, "stages")

