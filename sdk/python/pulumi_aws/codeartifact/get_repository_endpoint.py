# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = [
    'GetRepositoryEndpointResult',
    'AwaitableGetRepositoryEndpointResult',
    'get_repository_endpoint',
    'get_repository_endpoint_output',
]

@pulumi.output_type
class GetRepositoryEndpointResult:
    """
    A collection of values returned by getRepositoryEndpoint.
    """
    def __init__(__self__, domain=None, domain_owner=None, format=None, id=None, repository=None, repository_endpoint=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if domain_owner and not isinstance(domain_owner, str):
            raise TypeError("Expected argument 'domain_owner' to be a str")
        pulumi.set(__self__, "domain_owner", domain_owner)
        if format and not isinstance(format, str):
            raise TypeError("Expected argument 'format' to be a str")
        pulumi.set(__self__, "format", format)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if repository and not isinstance(repository, str):
            raise TypeError("Expected argument 'repository' to be a str")
        pulumi.set(__self__, "repository", repository)
        if repository_endpoint and not isinstance(repository_endpoint, str):
            raise TypeError("Expected argument 'repository_endpoint' to be a str")
        pulumi.set(__self__, "repository_endpoint", repository_endpoint)

    @property
    @pulumi.getter
    def domain(self) -> str:
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="domainOwner")
    def domain_owner(self) -> str:
        return pulumi.get(self, "domain_owner")

    @property
    @pulumi.getter
    def format(self) -> str:
        return pulumi.get(self, "format")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def repository(self) -> str:
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="repositoryEndpoint")
    def repository_endpoint(self) -> str:
        """
        URL of the returned endpoint.
        """
        return pulumi.get(self, "repository_endpoint")


class AwaitableGetRepositoryEndpointResult(GetRepositoryEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryEndpointResult(
            domain=self.domain,
            domain_owner=self.domain_owner,
            format=self.format,
            id=self.id,
            repository=self.repository,
            repository_endpoint=self.repository_endpoint)


def get_repository_endpoint(domain: Optional[str] = None,
                            domain_owner: Optional[str] = None,
                            format: Optional[str] = None,
                            repository: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryEndpointResult:
    """
    The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.codeartifact.get_repository_endpoint(domain=test_aws_codeartifact_domain["domain"],
        repository=test_aws_codeartifact_repository["repository"],
        format="npm")
    ```


    :param str domain: Name of the domain that contains the repository.
    :param str domain_owner: Account number of the AWS account that owns the domain.
    :param str format: Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
    :param str repository: Name of the repository.
    """
    __args__ = dict()
    __args__['domain'] = domain
    __args__['domainOwner'] = domain_owner
    __args__['format'] = format
    __args__['repository'] = repository
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:codeartifact/getRepositoryEndpoint:getRepositoryEndpoint', __args__, opts=opts, typ=GetRepositoryEndpointResult).value

    return AwaitableGetRepositoryEndpointResult(
        domain=pulumi.get(__ret__, 'domain'),
        domain_owner=pulumi.get(__ret__, 'domain_owner'),
        format=pulumi.get(__ret__, 'format'),
        id=pulumi.get(__ret__, 'id'),
        repository=pulumi.get(__ret__, 'repository'),
        repository_endpoint=pulumi.get(__ret__, 'repository_endpoint'))


@_utilities.lift_output_func(get_repository_endpoint)
def get_repository_endpoint_output(domain: Optional[pulumi.Input[str]] = None,
                                   domain_owner: Optional[pulumi.Input[Optional[str]]] = None,
                                   format: Optional[pulumi.Input[str]] = None,
                                   repository: Optional[pulumi.Input[str]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRepositoryEndpointResult]:
    """
    The CodeArtifact Repository Endpoint data source returns the endpoint of a repository for a specific package format.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.codeartifact.get_repository_endpoint(domain=test_aws_codeartifact_domain["domain"],
        repository=test_aws_codeartifact_repository["repository"],
        format="npm")
    ```


    :param str domain: Name of the domain that contains the repository.
    :param str domain_owner: Account number of the AWS account that owns the domain.
    :param str format: Which endpoint of a repository to return. A repository has one endpoint for each package format: `npm`, `pypi`, `maven`, and `nuget`.
    :param str repository: Name of the repository.
    """
    ...
